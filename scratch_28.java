import java.util.ArrayList;
import java.util.List;


class Scratch {
    public static void main(String[] args) {
        MainSecurity mainSecurity = new MainSecurity();
        mainSecurity.addListener(new Responder() {
            @Override
            public void isValid(boolean bn) {
                System.out.println("System check "+bn);
            }
        });
        mainSecurity.aa();
    }

    static class MainSecurity {

        private Responder responds;

        public void aa() {
            try {
                setResult(true || true || true);
                return;
            } catch (Exception en) {
            }
            setResult(false);
        }

        public void addListener(Responder responds) {
            this.responds = responds;
        }


        private void setResult(boolean bn) {
             responds.isValid(bn);
            System.out.println("is valid called" +bn);
        }

    }
    public interface Listener {
      public  void isValid(boolean bn);
    }

    public static class Responder implements Listener {
        private Responder() { System.out.println("responder"); }


        @Override
        public void isValid(boolean bn) {
            System.out.println("is valid caalled on responder side with valueof " + bn);
        }
    }

}