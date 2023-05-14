import java.util.Scanner;

    public class Principal {
        static String menu = """
                  (1) criar uma loja
                  (2) criar um produto
                  (3) sair
                """;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao = 0;
            Loja loja = null;
            Data d1 = null;

            while (opcao != 3) {
                System.out.println(menu);

                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.println("criar uma loja ");
                            System.out.println("Insira o nome da loja: ");
                            String loja1 = scanner.next();
                            System.out.println("Informe o número de funcionários: ");
                            int quantidadeFuncionarios = scanner.nextInt();
                            System.out.println("Informe o salário base dos funcionários: ");
                            double salarioBaseFuncionario = scanner.nextDouble();
                            System.out.println("Informe o endereço da loja: ");
                            System.out.println("Rua: ");
                            String nomeDaRua = scanner.next();
                            System.out.println("Cidade: ");
                            String cidade = scanner.next();
                            System.out.println("Estado: ");
                            String estado = scanner.next();
                            System.out.println("País: ");
                            String pais = scanner.next();
                            System.out.println("CEP: ");
                            String cep = scanner.next();
                            System.out.println("Número: ");
                            String numero = scanner.next();
                            System.out.println("Complemento: ");
                            String complemento = scanner.next();
                            Endereco e1 = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                            System.out.println("Insira a data de fundação (DD/MM/AAAA): ");
                            String dataFundacaoString = scanner.next();
                            String[] dataFundacaoSplit = dataFundacaoString.split("/");
                            int diaFundacao = Integer.parseInt(dataFundacaoSplit[0]);
                            int mesFundacao = Integer.parseInt(dataFundacaoSplit[1]);
                            int anoFundacao = Integer.parseInt(dataFundacaoSplit[2]);
                            d1 = new Data(diaFundacao, mesFundacao, anoFundacao);
                            new Loja(loja1, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1);
                            loja = new Loja(loja1, quantidadeFuncionarios, salarioBaseFuncionario, e1, d1);
                            System.out.println("Nome da loja: " + loja.getNome());
                            System.out.println("Quantidade de funcionários: " + loja.getQuantidadeFuncionarios());
                            System.out.println("Salário base total: " + loja.getSalarioBaseFuncionario());
                            System.out.println("Endereço da loja: " + loja.getEndereco());
                            System.out.println("Data de fundação: " + loja.getDataFundacao());

                            opcao = 3;


                            break;
                        case 2:
                            System.out.println("criar um produto: ");
                            System.out.println("Insira o nome do produto: ");
                            String nome = scanner.next();
                            System.out.println("Insira o preço do produto: ");
                            int preco = scanner.nextInt();
                            System.out.println("Insira a data de validade (DD/MM/AAAA): ");
                            String dataString = scanner.next();
                            String[] dataSplit = dataString.split("/");
                            int diaValidade = Integer.parseInt(dataSplit[0]);
                            int mesValidade = Integer.parseInt(dataSplit[1]);
                            int anoValidade = Integer.parseInt(dataSplit[2]);
                            Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                            Produto produto = new Produto(nome, preco, dataValidade);
                            System.out.println("Nome: " + produto.getNome());
                            System.out.println("Preço: " + produto.getPreco());
                            System.out.println("Data de validade: " + produto.getDataValidade());


                            if (produto.getDataValidade().compareTo(new Data(20, 10, 2023)) < 0) {
                                System.out.println("PRODUTO VENCIDO ");
                            } else {
                                System.out.println("PRODUTO NÃO VENCIDO");
                            }
                            opcao = 3;

                            break;
                        case 3:
                            System.out.println("Você está saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida ");
                            break;
                    }
                } else {
                    System.out.println("Opção inválida");
                    opcao = 3;
                    scanner.next();

                }
            }
        }
    }