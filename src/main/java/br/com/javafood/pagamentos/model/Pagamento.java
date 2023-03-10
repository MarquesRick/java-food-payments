package br.com.javafood.pagamentos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pagamentos")
@Getter //lombrok - not needs to create getters
@Setter //lombrok - not needs to create setters
@AllArgsConstructor //lombrok - not needs to create a contructor - AllArgs: Create a constructor with all args
@NoArgsConstructor //lombrok - not needs to create a contructor - AllArgs: Create a constructor with none args
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Positive
    private BigDecimal valor;
    @Size(max=100)
    private String nome;

    @Size(max=19)
    private String numero;

    @Size(max=7)
    private String expiracao;

    @Size(min=3, max=100)
    private String codigo;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;
    @NotNull
    private Long pedidoId;
    @NotNull
    private Long formaDePagamentoId;

}
