package ${PACKAGE_NAME};
import jdave.Group;
import jdave.Specification;
import jdave.junit4.JDaveRunner;
import org.junit.runner.RunWith;
#parse("File Header.java")
@RunWith(JDaveRunner.class)
@Group({"fast"})
public class ${NAME} extends Specification<Object> {
}
