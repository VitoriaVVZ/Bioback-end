public class Pessoa {

        String email;
        String telefone;

        Pessoa(String email, String telefone) {
            this.email = email;
            this.telefone = telefone;
        }

        @Override
        public String toString() {
            return "E-mail: " + email + " | Tel: " + telefone;
        }
    }
