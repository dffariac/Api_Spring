package br.com.apijava.Projeto.persistence.entity;


import org.springframework.data.annotation.Id;

public abstract class Usuario{
        @Id
        private Integer id;
        private String nome;
        private String cpf;
        private String endereco;
        private String email;
        private String senha;


        public Usuario() {
        }

        public Usuario(Integer id, String nome, String cpf, String endereco, String email, String senha) {
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
            this.email = email;
            this.senha = senha;
            this.id = id;
        }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }


    }
