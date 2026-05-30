package etitc.proyecto.infrastructure.out;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import etitc.proyecto.domain.model.Node;
import etitc.proyecto.domain.model.Sucursal;

@Component
public class Data {
    @Bean
    public Node initalData() {
        return Node.builder()
                .root(Sucursal.builder().name("Lilo Centro").street("Calle 10 # 5-23").build())
                .left(
                        Node.builder()
                                .root(Sucursal.builder().name("Lilo Norte").street("Avenida Libertadores 45").build())
                                .right(
                                        Node.builder()
                                                .root(Sucursal.builder().name("Lilo Occidente")
                                                        .street("Carrera 68 # 12-45").build())
                                                .build())
                                .left(
                                        Node.builder()
                                                .root(Sucursal.builder().name("Lilo Sur")
                                                        .street("Diagonal 4A # 18-90").build())
                                                .left(Node.builder()
                                                        .root(Sucursal.builder().name("Lilo Chapinero")
                                                                .street("Carrera 13 # 55-22").build())
                                                        .build())
                                                .build())
                                .build())
                .right(
                        Node.builder()
                                .root(Sucursal.builder().name("Lilo Usaquén").street("Calle 116 # 15-40").build())
                                .left(
                                        Node.builder()
                                                .root(Sucursal.builder().name("Lilo Fontibón")
                                                        .street("Carrera 100 # 22-14")
                                                        .build())
                                                .left(
                                                        Node.builder()
                                                                .root(Sucursal.builder().name("Lilo Kennedy")
                                                                        .street("Avenida Primero de Mayo # 71-22")
                                                                        .build())
                                                                .left(
                                                                        Node.builder()
                                                                                .root(Sucursal.builder()
                                                                                        .name("Lilo Teusaquillo")
                                                                                        .street("Calle 34 # 19-32")
                                                                                        .build())
                                                                                .build())
                                                                .build())
                                                .right(
                                                        Node.builder()
                                                                .root(Sucursal.builder().name("Lilo Suba")
                                                                        .street("Avenida Suba # 118-54").build())
                                                                .build())
                                                .build())

                                .build())
                .build();
    }
}
