import java.io.*;

public class Kuku {
    /** 表示する問題の個数 */
    public static final int MAX_QUESTION = 10;
    /**
     * 九九の問題をMAX_QUESTION回繰り返して出題する。
     * 最後に正答率を表示する。
     */
    public static void main(String[] args) {
        int goodAnswers = 0;    // 正答の個数
        System.out.println("これから九九の問題を" + MAX_QUESTION + "問出します。");
        /**
         * 以下、問題を繰り返し表示し、ユーザからの解答を判断する。
         * 正当の数を数える
         */
        for (int i = 0; i < MAX_QUESTION; i++) {
        	/**
        	 * 足し算か引き算かをえらぶ
        	 */
        	boolean ok;
        	int questby = (int)(Math.random() * 4);
        			
        	switch (questby) {
        		case 0: ok = showAdditionalQuestion(i + 1);	
        				break;
        		case 1: ok = showSubstractionalQuestion(i + 1); 
        				break; 
        		case 2: ok = showMultiplyQuestion(i + 1); 
        				break;
        		case 3: ok = showDividalQuestion(i + 1); 
        				break;
        		default: ok = false; 
        				break;
        	}
        	if (ok) {
        		goodAnswers++;
        	}
        }
        double rate = goodAnswers * 100.0 / MAX_QUESTION;
        System.out.println("");
        System.out.println("問題は" + MAX_QUESTION + "問ありました。");
        System.out.println("正しく答えられたのは" + goodAnswers + "問で、");
        System.out.println("間違ってしまったのは" + (MAX_QUESTION - goodAnswers) + "問です。");
        System.out.println("正答率は" + rate + "%です。");
        System.out.println("");
        System.out.println("お疲れさま。");
    }
    
    // 足し算
    public static boolean showAdditionalQuestion(int questno) {
        int x = (int)(Math.random() * 9) + 1;
        int y = (int)(Math.random() * 9) + 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("［第" + questno + "問］  " + x + " + " + y + " ＝ ？");
            String line = reader.readLine();
            int result = Integer.parseInt(line);
            if (x + y == result) {
                System.out.println("はい、正しいです。");
                return true;
            } else {
                System.out.println("残念、まちがいです。");
                return false;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("入力が正しくありません。");
        }
        return false;
    }
    
	// 引き算
    public static boolean showSubstractionalQuestion(int questno) {
        int x = (int)(Math.random() * 9) + 1;
        int y = (int)(Math.random() * 9) + 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("［第" + questno + "問］  " + x + " - " + y + " ＝ ？");
            String line = reader.readLine();
            int result = Integer.parseInt(line);
            if (x - y == result) {
                System.out.println("はい、正しいです。");
                return true;
            } else {
                System.out.println("残念、まちがいです。");
                return false;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("入力が正しくありません。");
        }
        return false;
    }
    
	// 掛け算
    public static boolean showMultiplyQuestion(int questno) {
        int x = (int)(Math.random() * 9) + 1;
        int y = (int)(Math.random() * 9) + 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("［第" + questno + "問］  " + x + " × " + y + " ＝ ？");
            String line = reader.readLine();
            int result = Integer.parseInt(line);
            if (x * y == result) {
                System.out.println("はい、正しいです。");
                return true;
            } else {
                System.out.println("残念、まちがいです。");
                return false;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("入力が正しくありません。");
        }
        return false;
    }
    
	// 割り算
    public static boolean showDividalQuestion(int questno) {
        int x = (int)(Math.random() * 9) + 1;
        int y = (int)(Math.random() * 9) + 1;
        int a1, a2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("［第" + questno + "問］  " + x + " ÷ " + y + " ＝ ？");
            System.out.println(" あまりは-で区切って入力してください");
            String line = reader.readLine();
            String results[] = line.split("-"); // 1-2 という入力を {1,2} にして返します
            // 余りがある場合は上、ない場合は0を代入
            if (results.length == 2) {
            	a1 = Integer.parseInt(results[0]);
            	a2 = Integer.parseInt(results[1]);
            } else {
            	a1 = Integer.parseInt(results[0]);
            	a2 = 0;
            }
            
            if (x / y == a1 && x % y == a2) {
                System.out.println("はい、正しいです。");
                return true;
            } else {
                System.out.println("残念、まちがいです。");
                if (x % y > 0) { // 余りが含まれるときは答えをだす
                    System.out.println("答えは" + (x / y) + "あまり" + (x % y));                	
                }
                return false;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("入力が正しくありません。");
        }
        return false;
    }
}
