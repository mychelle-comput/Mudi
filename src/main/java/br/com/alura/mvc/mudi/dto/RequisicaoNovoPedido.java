package br.com.alura.mvc.mudi.dto;


import br.com.alura.mvc.mudi.model.Pedido;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequisicaoNovoPedido {

    @NotBlank(message = "O Nome do produto é obrigatório!")
    private String nomeProduto;

    @NotBlank(message = "A Url do produto é obrigatório!")
    private String urlProduto;

    @NotBlank(message = "A Url da imagem é obrigatório!")
    private String urlImagem;

    private String descricao;

    public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlProduto(urlProduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setDescricao(descricao);
        return pedido;
    }
}
