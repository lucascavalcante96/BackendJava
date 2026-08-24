package aulas;

import Entities.Order;
import Entities.enums.Enumeracao;

import java.util.Date;

public class pedido {
    static void main() {
        Order order = new Order(1080, new Date(), Enumeracao.PENDING_PAYMENT);

        System.out.println(order);

        Enumeracao os2 = Enumeracao.DELIVERED;

        Enumeracao os3 = Enumeracao.valueOf("DELIVERED");
    }
}
