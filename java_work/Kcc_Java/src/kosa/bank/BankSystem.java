//package kosa.bank;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class BankSystem {
//	private MyBank myBank;		//MyBank
//
//	public BankSystem(){
//		myBank = new MyBank();
//		showMenu();
//	}
//
//	public void showMenu(){		//show method 留뚮뱾湲�
//		String  menu = null;
//		String id = null;
//		String name = null;
//		long balance = 0;
//
//		do{
//
//			System.out.println("****硫붾돱瑜� �엯�젰�븯�꽭�슂****");
//			System.out.println("1. 怨좉컼�벑濡�");
//			System.out.println("2. 怨좉컼蹂닿린(1紐�)");
//			System.out.println("3. 怨좉컼�쟾泥대낫湲�");
//			System.out.println("4. 怨좉컼�삁湲덉텧湲�");
//			System.out.println("5. 怨좉컼�삁湲덉엯湲�");
//			System.out.println("***�걹�궡湲�***");
//			System.out.println("***************");
//			System.out.print(">>");
//
//			menu = readFromKeyboard();
//
//			if(menu.equals("1")){				//怨좉컼�벑濡�
//
//				System.out.print("ID瑜� �엯�젰�븯�꽭�슂: ");
//				id = readFromKeyboard();
//
//				System.out.print("�씠由꾩쓣 �엯�젰�븯�꽭�슂: ");
//				name = readFromKeyboard();
//
//				System.out.print("�옍怨좊�� �엯�젰�븯�꽭�슂: ");
//				balance = Long.parseLong(readFromKeyboard());
//
//				myBank.addCustomer(id, name, balance);
//
//			}else if(menu.equals("2")){  //怨좉컼蹂닿린
//				System.out.print("怨좉컼ID瑜� �엯�젰�븯�꽭�슂: ");
//				id = readFromKeyboard();
//				Customer cust = myBank.getCustomer(id);
//				System.out.println(cust.getId() +":" + cust.getName() + ": "
//						+ cust.getAccount().getBalance());
//
//			}else if(menu.equals("3")){  // �쟾泥� 怨좉컼
//
//				Customer[] allCust = myBank.getAllCustomers();
//
//				for(int i=0;i<allCust.length;i++){
//					System.out.println(allCust[i].getId() + ": " +
//													allCust[i].getName() + " :" +
//													allCust[i].getAccount().getBalance());
//				}
//
//			}else if(menu.equals("4")){  //異쒓툑
//
//				System.out.print("怨좉컼�쓽 ID瑜� �엯�젰�븯�꽭�슂.: ");
//				id = readFromKeyboard();
//
//				Customer cust = myBank.getCustomer(id);
//
//				if(cust == null){
//					System.out.println("�벑濡앸맂 怨좉컼�씠 �븘�떃�땲�떎.");
//
//				}else{
//					System.out.print("異쒓툑�븸�쓣 �엯�젰�븯�꽭�슂: ");
//					balance = Long.parseLong(readFromKeyboard());
//
//					if(cust.getAccount().withdraw(balance)){
//						System.out.println("�젙�긽�쟻�쑝濡� 異쒓툑�릺�뿀�뒿�땲�떎.");
//						System.out.println("異쒓툑�썑 �옍怨좊뒗 :" + cust.getAccount().getBalance());
//					}else{
//						System.out.println("�옍怨좉� 遺�議깊빀�땲�떎.");
//					}
//				}
//
//			}else if(menu.equals("5")) { // �엯湲�
//
//                // 怨좉컼 ID �엯�젰
//                System.out.print("怨좉컼�쓽 ID瑜� �엯�젰�븯�꽭�슂.: ");
//                id = readFromKeyboard();
//
//                // 怨좉컼 �젙蹂� 議고쉶
//                Customer cust = myBank.getCustomer(id);
//
//                // 怨좉컼 �젙蹂� �뾾�쓬
//                if (cust == null) {
//                    System.out.println("�벑濡앸맂 怨좉컼�씠 �븘�떃�땲�떎.");
//                } else {
//                    // �엯湲덉븸 �엯�젰
//                    System.out.print("�엯湲덉븸�쓣 �엯�젰�븯�꽭�슂: ");
//                    long amount = Long.parseLong(readFromKeyboard());
//
//                    // �엯湲� 泥섎━
//                    if (cust.getAccount().deposit(amount)) {
//                        System.out.println("�젙�긽�쟻�쑝濡� �엯湲덈릺�뿀�뒿�땲�떎.");
//                        System.out.println("�엯湲� �썑 �옍怨좊뒗: " + cust.getAccount().getBalance());
//                    } else {
//                        System.out.println("�엯湲덉뿉 �떎�뙣�뻽�뒿�땲�떎.");
//                    }
//                }
//
//
//            }
//
//
//		}while(!menu.equals("q"));
//	}
//
//
//
//	public String readFromKeyboard(){
//		String input = null;
//		try{
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			input = br.readLine();
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//		return input;
//	}
//
//	public static void main(String[] args) {
//		BankSystem bank = new BankSystem();
//
//	}
//
//}
//
//
//
//
//
//
//
//
//
//
