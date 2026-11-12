package com.projeto.emprestimo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O patrimônio é obrigatório")
    @Column(nullable = false, unique = true)
    private String patrimonio;

    @NotBlank(message = "O nome é obrigatório")
    @Column(nullable = false)
    private String nome;

    @NotBlank(message = "O tipo é obrigatório")
    @Enumerated(EnumType.STRING)//como o enum é guardado no banco
    @Column(nullable = false)
    private TipoEquipamento tipo;

    @Column(nullable = false)
    private boolean disponivel = true;

    public Equipamento() {

    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public @NotBlank(message = "O tipo é obrigatório") TipoEquipamento getTipo() {
        return tipo;
    }

    public void setTipo(@NotBlank(message = "O tipo é obrigatório") TipoEquipamento tipo) {
        this.tipo = tipo;
    }

    public @NotBlank(message = "O nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O patrimônio é obrigatório") String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(@NotBlank(message = "O patrimônio é obrigatório") String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
