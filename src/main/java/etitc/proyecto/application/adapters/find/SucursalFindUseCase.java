package etitc.proyecto.application.adapters.find;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import etitc.proyecto.application.ports.find.SucursalFindPort;
import etitc.proyecto.domain.exception.SucursalNotFound;
import etitc.proyecto.domain.model.Node;
import etitc.proyecto.domain.model.Sucursal;
import etitc.proyecto.infrastructure.out.persistence.impl.SucursalsRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SucursalFindUseCase implements SucursalFindPort {
    private final SucursalsRepository sucursalsRepository;
    private final Node graph;

    @Override
    public Sucursal findById(UUID id) {
        return sucursalsRepository.findById(id).orElseThrow(() -> new SucursalNotFound(
                String.format("Dessert with id %s not found", id)));
    }

    @Override
    public List<Sucursal> findAll() {
        return sucursalsRepository.findAll();
    }
@Override
    public List<Sucursal> findRelatedSucursals(String name) {
        Node listNode = getListConnected(graph, name);

        if (listNode == null) {
            throw new SucursalNotFound(String.format("La sucursal con el nombre '%s' no existe", name));
        }

        return nodeToList(listNode);
    }

    private Node getListConnected(Node root, String name) {
        if (root == null || root.getRoot() == null) {
            return null; 
        }
        System.out.println(root.getRoot().getName());
        
        if (root.getRoot().getName().equals(name)) {
            return root;
        }
        
        Node left = getListConnected(root.getLeft(), name);

        if (left != null) {
            return left;
        }

        return getListConnected(root.getRight(), name);
    }

    private List<Sucursal> nodeToList(Node node) {
        List<Sucursal> result = new ArrayList<>();

        if (node == null) {
            return result;
        }

        if (node.getRoot() != null) {
            result.add(node.getRoot());
        }

        if (node.getLeft() != null) {
            result.addAll(nodeToList(node.getLeft()));
        }

        if (node.getRight() != null) {
            result.addAll(nodeToList(node.getRight()));
        }

        return result;
    }
}
