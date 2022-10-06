 public class Main {
        public static void main(String[]args){
        cliente pfisi = new ClientePF();
        cliente pjuri = new ClientePJ();
        
        if(pfisi.autenticar(()){
        System.out.println("A conta está autenticada");
        
        }else {
        System.out.println("Conta não está autenticada);
        
        }


        }

//METODO AUTENTICAR, vou usar chave dono e cpf
            //ClientePessoaFisica: A autenticação deverá comparar se a chave é igual ao CPF.
             public boolean autenticar1(String chave){

                 if(chave.equals(this.numero)){
                     return true;
            }
                 else
                     return false;
             }
        }
