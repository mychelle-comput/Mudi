package br.com.alura.mvc.mudi.controller;


import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private PedidoRepository pedidoRepository;

    //Este método recupera todos os pedidos do banco de dados e os envia a página inicial ("/home").
    @GetMapping("/home")
    public String home(Model model) {
        List<Pedido> pedidos = pedidoRepository.findAll();
        model.addAttribute("pedidos", pedidos);
        return "/home";
    }
}
