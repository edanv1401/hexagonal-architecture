package etitc.proyecto.infrastructure.in.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import etitc.proyecto.application.adapters.find.SucursalFindUseCase;
import etitc.proyecto.domain.model.Sucursal;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/sucursals")
public class SucursalsController {
    private final SucursalFindUseCase sucursalFindUseCase;

    @GetMapping
    public List<Sucursal> getAll(){
        return sucursalFindUseCase.findAll();
    }

    @GetMapping("/related")
    public List<Sucursal> getRelated(@RequestParam String name){
        return sucursalFindUseCase.findRelatedSucursals("Lilo Suba");
    }
}
