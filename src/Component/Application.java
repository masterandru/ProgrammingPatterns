/* user 24.12.2016 */
/* Паттерн "Компановщик" */
package Component;

public class Application {

    public static final int LEVEL_ONE = 1;

    public static void main(String[] args) {


        Folder folder1 = new Folder("folder1",LEVEL_ONE);
        Folder folder2 = new Folder("folder2",LEVEL_ONE);
        Folder folder3 = new Folder("folder3",LEVEL_ONE);
        Folder folder4 = new Folder("folder4",LEVEL_ONE);

        folder1.add(folder2);
        folder2.add(folder3);
        folder1.add(folder4);

        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");
        File file5 = new File("file5");
        File file6 = new File("file6");

        folder2.add(file1);
        folder2.add(file2);
        folder2.add(file3);

        folder4.add(file4);
        folder4.add(file5);
        folder4.add(file6);

        folder1.printOut(0);




    }

}
