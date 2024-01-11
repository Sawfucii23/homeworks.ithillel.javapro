package homeworks.hw21;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {

    private static Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public LessonDao(Connection connection) {
        this.connection = connection;
    }

    public static void addLesson(Lesson lesson) {
        String sql = "INSERT INTO Lesson (name,  homework_id) VALUES (?, ?)";
        try (
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            //pstmt.setInt(1, lesson.getId());
            pstmt.setString(1, lesson.getName());
            //pstmt.setDate(3, Date.valueOf(LocalDate.now()));
            pstmt.setInt(2, lesson.getId());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод видалення уроку
    public static void deleteLesson(int id) {
        String sql = "DELETE FROM Lesson WHERE id = ?";
        try (
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Метод отримання всіх уроків
    public static List<Lesson> getAllLessons() {
        List<Lesson> lessons = new ArrayList<>();
        String sql = "SELECT * FROM Lesson";
        try (
             Statement stmt = connection.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {

            while (resultSet.next()) {
                Lesson lesson = null;

                final Integer lessonId = resultSet.getInt("id");
                final String lessonName = resultSet.getString("name");
                final Integer lessonHwId = resultSet.getInt("homework_id");

                Homework homework = null;




                final PreparedStatement statement1 = connection.prepareStatement("SELECT * FROM homework WHERE id = ?");
                statement1.setInt(1, lessonHwId);
                final boolean dataRead1 = statement1.execute();

                if (dataRead1) {
                    final ResultSet resultSet1 = statement1.getResultSet();
                    while (resultSet1.next()) {
                        final Integer homeworkId = resultSet1.getInt("id");
                        final String homeworkName = resultSet1.getString("name");
                        final String homeworkDescription = resultSet1.getString("description");

                        homework = new Homework(homeworkId, homeworkName, homeworkDescription);
                        lesson = new Lesson(lessonId, lessonName, homework);


                        lessons.add(lesson);
                    }
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return lessons;
    }



//    public static Lesson findById01(Integer id) {
//
//        String sql = "SELECT * FROM Lesson WHERE id = ?";
//        Lesson lesson;
//        Connection conn = null;
//        try {
//            conn = DataBaseConnection.getConnection();
//
//        Statement stmt = conn.createStatement();
//             ResultSet resultSet = stmt.executeQuery(sql); {
//
//
////            final PreparedStatement statement = DataBaseConnection.getConnection().prepareStatement("SELECT * FROM Lesson WHERE id = ?");
////            statement.setInt(1, id);
//
////            final boolean dataRead = stmt.execute();
//            Homework homework = new Homework(0, "", "");
//            lesson = new Lesson(0, "", homework);
//
////            if (dataRead) {
////                final ResultSet resultSet = statement.getResultSet();
//            while (resultSet.next()) {
//                final Integer lessonId = resultSet.getInt("id");
//                final String lessonName = resultSet.getString("name");
//                final Integer lessonHwId = resultSet.getInt("homework_id");
//
//
////                    final PreparedStatement statement1 = DataBaseConnection.getConnection().prepareStatement("SELECT * FROM homework WHERE id = ?");
////                    statement1.setInt(1, lessonHwId);
////                    final boolean dataRead1 = statement1.execute();
//
//                try (Connection conn1 = DataBaseConnection.getConnection();
//                     Statement stmt1 = conn1.createStatement();
//                     ResultSet resultSet1 = stmt1.executeQuery(sql)) {
//
////                    if (dataRead1) {
////                        final ResultSet resultSet1 = stmt1.getResultSet();
//
//                    while (resultSet1.next()) {
//                        final Integer homeworkId = resultSet1.getInt("id");
//                        final String homeworkName = resultSet1.getString("name");
//                        final String homeworkDescription = resultSet1.getString("description");
//                        homework.setDescription(homeworkDescription);
//                        homework.setName(homeworkName);
//                        homework.setId(homeworkId);
//
//                        lesson.setHomework(homework);
//
//
//                    }
//                }
////                }
//                catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//
//
//            }
//
//
//        }
//        }
//        catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return lesson;
//
//
//    }




    public static Lesson findById(Integer id) {
        String sql = "SELECT * FROM Lesson WHERE id = ?";
        Lesson lesson = new Lesson(0, "", null);
        try (
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                Integer lessonId = resultSet.getInt("id");

                String lessonName = resultSet.getString("name");
                //System.out.println(lessonName);
                Integer lessonHwId = resultSet.getInt("homework_id");

                Homework homework;
                homework = getHomeworkById(lessonHwId);
               lesson = new Lesson(lessonId, lessonName, homework);
            }
        }
        catch (SQLException e) {

            e.printStackTrace();
        }
        return lesson;
    }





    public static Homework getHomeworkById(Integer id) {
        String sql = "SELECT * FROM Homework WHERE id = ?";
        Homework homework = null;

        try (
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                Integer homeworkId = resultSet.getInt("id");
                String homeworkName = resultSet.getString("name");
                String homeworkDescription = resultSet.getString("description");
                homework = new Homework(homeworkId, homeworkName, homeworkDescription);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        return homework;
    }


}

