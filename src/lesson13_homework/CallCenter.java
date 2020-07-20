package lesson13_homework;

import java.util.concurrent.Semaphore;

public class CallCenter {
    private static final int OPERATORS_COUNT = 2;
    private static final int CLIENTS_COUNT = 15;
    //оператор занят - true, оператор свободен - false
    private static final boolean[]  OPERATORS = new boolean[OPERATORS_COUNT];
    private static final Semaphore SEMAPHORE = new Semaphore(OPERATORS_COUNT, true);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("***************Коллцентр начал свою работу*****************");
        for (int i = 1; i <= CLIENTS_COUNT; i++) {
            new Thread(new Client(i)).start();
            Thread.sleep(1000);
        }
    }

    public static class Client implements Runnable {
        private int clientNumber;

        public Client(int clientNumber) {
            this.clientNumber = clientNumber;
        }

        @Override
        public void run() {
            System.out.printf("Клиент №%d звонит в коллцентр.\n", clientNumber);
            try {
                SEMAPHORE.acquire();

                int operatorNumber = -1;
                for (int i = 0; i < 5; i++)
                    if (!OPERATORS[i]) {      //Если оператор свободен
                        OPERATORS[i] = true;  //занимаем его
                        operatorNumber = i;         //Наличие свободного оператора, гарантирует семафор
                        System.out.printf("Оператор №%d начал разговор с клиентом №%d.\n", i+1, clientNumber);
                        break;
                    }

                Thread.sleep(5000);

                OPERATORS[operatorNumber] = false;//Освобождается оператор
                SEMAPHORE.release();
                System.out.printf("Оператор закончил разговор с клиентом №%d.\n", clientNumber);
            } catch (InterruptedException e) {
                System.err.println();
            }
        }
        }
    }
