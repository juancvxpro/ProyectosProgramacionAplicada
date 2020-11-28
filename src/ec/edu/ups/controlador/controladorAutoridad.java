package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Autoridad;

/**
 *
 * @author user
 */
public class controladorAutoridad extends AbstractControlador<Autoridad> {
      private Autoridad autoridad;
    public controladorAutoridad( String ruta) {
        super(ruta);
       
    }
    
   

    @Override
    public boolean validar(Autoridad objeto) {
        if (objeto.getRol().equals("Autoridad")) {
            int suma = 0;
        String x = objeto.getCedula();
        if (x.length() == 9) {
            return false;
        } else {
            int a[] = new int[x.length() / 2];
            int b[] = new int[(x.length() / 2)];
            int c = 0;
            int d = 1;
            for (int i = 0; i < x.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(x.charAt(c)));
                c = c + 2;
                if (i < (x.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(x.charAt(d)));
                    d = d + 2;
                }
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;
                }
                suma = suma + a[i] + b[i];
            }
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length() - 1)))) {
                return true;
            } else if (suma % 10 == 0 && x.charAt(x.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }
        }
        }else{
         return false;
        }
       

    }

    @Override
    public int generarId() {
        return 0;

    }

    public boolean iniciarSesion(String correo, String pass) {

        for (Autoridad usu : super.getLista()) {
            Autoridad u = (Autoridad) usu;
            if (u.getCorreo().equals(correo) && u.getPass().equals(pass)) {
                this.autoridad = u;
                return true;
            }

        }
        return false;
    }

    public Autoridad getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(Autoridad autoridad) {
        this.autoridad = autoridad;
    }

}
