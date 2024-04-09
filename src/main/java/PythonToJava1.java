import java.sql.*;
import java.util.Scanner;
public class PythonToJava1 {
    public static void main(String[] args) {
        String host = "localhost";
        String port = "3306"; // MySQL 포트 번호
        String user = "root";
        String password = "password";
        String database = "db";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL JDBC 드라이버 로드
            Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, user, password);
            Statement statement = connection.createStatement();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("원하시는 작업을 선택하세요 <0> 취소 <1> 비제이 추가 <2> 비제이 삭제 <3> 정보 수정 : ");
                int process = scanner.nextInt();
                if (process == 0) {
                    System.out.println("취소되었습니다.");
                    break;
                } else if (process == 1) { // 추가
                    while (true) {
                        System.out.print("추가하려는 비제이의 이름을 입력하세요. (취소하려면 0을 입력하세요.) : ");
                        String bjName = scanner.next();
                        if (bjName.equals("0")) {
                            System.out.println("취소되었습니다.");
                            break;
                        } else {
                            System.out.print("추가하려는 비제이의 아이디를 입력하세요. : ");
                            String bjId = scanner.next();
                            System.out.print("추가하려는 비제이의 소속을 입력하세요. : ");
                            String department = scanner.next();
                            String forward = bjId.substring(0, 2);
                            String imgLink = "http://stimg.afreecatv.com/LOGO/" + forward + "/" + bjId + "/" + bjId + ".jpg";

                            String query = String.format("insert into bj values('%s','%s', '%s', '%s')", bjName, bjId, department, imgLink);
                            statement.executeUpdate(query);

                            System.out.print("다음 작업을 선택하세요. <1> 비제이 더 추가 <2> 완료 : ");
                            int nextProcess = scanner.nextInt();
                            if (nextProcess == 1)
                                continue;
                            else {
                                System.out.println("비제이 추가를 완료하였습니다.");
                                break;
                            }
                        }
                    }
                } else if (process == 2) { // 삭제
                    while (true) {
                        ResultSet resultSet = statement.executeQuery("select * from bj");
                        System.out.print("삭제하려는 비제이의 이름을 입력하세요. (취소하려면 0을 입력하세요.) : ");
                        String bjName = scanner.next();
                        if (bjName.equals("0")) {
                            System.out.println("취소되었습니다.");
                            break;
                        } else {
                            String query = String.format("delete from bj where name like '%%%s%%'", bjName);
                            statement.executeUpdate(query);

                            System.out.print("다음 작업을 선택하세요. <1> 비제이 더 삭제 <2> 완료 : ");
                            int nextProcess = scanner.nextInt();
                            if (nextProcess == 1)
                                continue;
                            else {
                                System.out.println("비제이 삭제를 완료하였습니다.");
                                break;
                            }
                        }
                    }
                } else if (process == 3) { // 수정
                    while (true) {
                        ResultSet resultSet = statement.executeQuery("select * from bj");
                        System.out.println("정보를 수정하려는 비제이 명을 입력하세요.(취소하려면 0을 입력하세요.) : ");
                        String bjName = scanner.next();
                        if (bjName.equals("0")) {
                            System.out.println("취소되었습니다.");
                            break;
                        } else {
                            ResultSetMetaData metaData = resultSet.getMetaData();
                            int columnCount = metaData.getColumnCount();
                            for (int i = 1; i <= columnCount; i++) {
                                System.out.println(metaData.getColumnName(i));
                            }
                            System.out.println("위 리스트에서 수정하려는 컬럼의 순번을 입력하세요.(1 ~ 5) : ");
                            int targetNum = scanner.nextInt();
                            String targetColumn = metaData.getColumnName(targetNum);
                            System.out.println("선택한 컬럼 : " + targetColumn);
                            System.out.println(targetColumn + "의 최신 정보를 입력하세요. : ");
                            String newInfo = scanner.next();

                            if (!newInfo.isEmpty()) {
                                String query = String.format("update bj set %s='%s' where name like '%%%s%%'", targetColumn, newInfo, bjName);
                                statement.executeUpdate(query);
                            } else {
                                String query = String.format("update bj set %s=null where name like '%%%s%%'", targetColumn, bjName);
                                statement.executeUpdate(query);
                            }

                            System.out.print("다음 작업을 선택하세요. <1> 비제이 정보 추가 수정 <2> 완료 : ");
                            int nextProcess = scanner.nextInt();
                            if (nextProcess == 1)
                                continue;
                            else {
                                System.out.println("정보 수정을 완료하였습니다.");
                                break;
                            }
                        }
                    }
                }

                System.out.print("추가 작업을 진행하시겠습니까 <1> 예 <2> 아니오 : ");
                String askProcess = scanner.next();
                if (askProcess.equals("1"))
                    continue;
                else {
                    System.out.println("작업을 종료합니다.");
                    break;
                }
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
