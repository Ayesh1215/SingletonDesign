public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Abc obj = Abc.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Abc obj = Abc.getInstance();
            }
        });
        t1.start();
        t2.start();
    }
    static class Abc {
        public static Abc obj;
        private Abc() {

            System.out.println("Instance Created");
        }

        public static Abc getInstance() {
            if (obj == null) {
                synchronized (Abc.class){
                    if(obj==null){
                                obj=new Abc();
                        }
                    }
                }
                return obj;
            }
        }
    }





