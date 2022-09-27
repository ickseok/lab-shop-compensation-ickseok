package labshopcompensationickseok.domain;

import labshopcompensationickseok.domain.*;
import labshopcompensationickseok.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}


