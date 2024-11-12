package ArvoreSintatica;

import java.util.Stack;

public class Teste {

    // Define a pilha para o analisador
    private Stack<String> pilha;

    public Teste() {
        pilha = new Stack<>();
    }

    // Método para fazer a análise sintática
    public void analisar(String entrada) {
        pilha.push("$");
        pilha.push("E");

        // Criamos uma posição para percorrer a entrada
        int i = 0;
        while (!pilha.isEmpty()) {
            String topo = pilha.peek();
            char simbolo = entrada.charAt(i);

            // Verifica o topo da pilha e o símbolo atual da entrada
            if (topo.equals("E")) {
                if (simbolo == '(' || Character.isDigit(simbolo)) {
                    pilha.pop();
                    pilha.push("E'");
                    pilha.push("T");
                } else {
                    throw new RuntimeException("Erro de sintaxe!");
                }
            } else if (topo.equals("E'")) {
                if (simbolo == '+' || simbolo == '-') {
                    pilha.pop();
                    pilha.push("T");
                    pilha.push("E'");
                } else {
                    pilha.pop();  // Caso `E'` -> ε
                }
            } else if (topo.equals("T")) {
                if (simbolo == '(' || Character.isDigit(simbolo)) {
                    pilha.pop();
                    pilha.push("T'");
                    pilha.push("F");
                } else {
                    throw new RuntimeException("Erro de sintaxe!");
                }
            } else if (topo.equals("T'")) {
                if (simbolo == '*' || simbolo == '/') {
                    pilha.pop();
                    pilha.push("F");
                    pilha.push("T'");
                } else {
                    pilha.pop();  // Caso `T'` -> ε
                }
            } else if (topo.equals("F")) {
                if (simbolo == '(') {
                    pilha.pop();
                    pilha.push(")");
                    pilha.push("E");
                } else if (Character.isDigit(simbolo)) {
                    pilha.pop();
                    i++;  // Avança no símbolo numérico
                } else {
                    throw new RuntimeException("Erro de sintaxe!");
                }
            } else if (topo.equals("(")) {
                pilha.pop();
                i++;  // Abre parênteses
            } else if (topo.equals(")")) {
                pilha.pop();
                i++;  // Fecha parênteses
            } else if (topo.equals("$")) {
                if (i == entrada.length()) {
                    System.out.println("Entrada válida!");
                } else {
                    throw new RuntimeException("Erro de sintaxe!");
                }
            }
        }
    }

    public static void main(String[] args) {
        Teste tabela = new Teste();
        // ArvoreSintatica.Teste com uma expressão válida
        tabela.analisar("3+5*(2-8)");
    }
}
