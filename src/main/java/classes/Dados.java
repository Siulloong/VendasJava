
package classes;

public class Dados {
    public boolean validarUsuario(String usuario,String senha){
        if (usuario.equals("Siu") && senha.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
