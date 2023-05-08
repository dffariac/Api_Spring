package br.com.apijava.Projeto.persistence.entity;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

public class Emprestimo {
        private int id;
        private Livro livro;
        private Cliente cliente;
        private Instant dataEmprestimo;
        private Instant dataDevolucao;

        public Emprestimo(int id, Livro livro, Cliente cliente) {
            this.id = id;
            this.livro = livro;
            this.cliente = cliente;
            this.dataEmprestimo = Instant.now();
            this.dataDevolucao = dataEmprestimo.plus(Duration.ofDays(7));
        }

        public Emprestimo(int id, Livro livro, Cliente cliente, Instant dataEmprestimo, Instant dataDevolucao) {
            this.id = id;
            this.livro = livro;
            this.cliente = cliente;
            this.dataEmprestimo = dataEmprestimo;
            this.dataDevolucao = dataDevolucao;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Livro getLivro() {
            return livro;
        }

        public void setLivro(Livro livro) {
            this.livro = livro;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public Instant getDataEmprestimo() {
            return dataEmprestimo;
        }

        public void setDataEmprestimo(Instant dataEmprestimo) {
            this.dataEmprestimo = dataEmprestimo;
        }

        public Instant getDataDevolucao() {
            return dataDevolucao;
        }

        public void setDataDevolucao(Instant dataDevolucao) {
            this.dataDevolucao = dataDevolucao;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Emprestimo that = (Emprestimo) o;
            return id == that.id && Objects.equals(livro, that.livro) && Objects.equals(cliente, that.cliente) && Objects.equals(dataEmprestimo, that.dataEmprestimo) && Objects.equals(dataDevolucao, that.dataDevolucao);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, livro, cliente, dataEmprestimo, dataDevolucao);
        }

        @Override
        public String toString() {
            return "Emprestimo{" +
                    "id=" + id +
                    ", livro=" + livro +
                    ", cliente=" + cliente +
                    ", dataEmprestimo=" + dataEmprestimo +
                    ", dataDevolucao=" + dataDevolucao +
                    '}';
        }

        public String toJson() {
            return "{\"id\": " + this.getId() + ", \"livroId\": " + this.getLivro().getId() +
                    ", \"clienteId\": " + this.getCliente().getId() + ", \"dataEmprestimo\": \"" + this.getDataEmprestimo().toString() +
                    "\", \"dataDevolucao\": \"" + this.getDataDevolucao().toString() + "\"}";
        }
}
