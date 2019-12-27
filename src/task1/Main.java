package task1;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("text.txt");
        writeToFile(file, Person.class);
    }

    public static void writeToFile(File file, Class<?> someClass) throws Exception{
        Field[]fields = someClass.getDeclaredFields();
        Writer wr = new FileWriter(file);
        for (int i = 0; i <fields.length ; i++) {
            Field field = fields[i];
            if (field.getAnnotation(Annotation.class) instanceof Annotation){
                wr.write(field.getName()+" --- "+field.getAnnotation(Annotation.class).params()+";  ");
            }
        }
        wr.close();
    }
}
