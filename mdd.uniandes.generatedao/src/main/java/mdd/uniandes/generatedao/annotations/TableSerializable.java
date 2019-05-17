package mdd.uniandes.generatedao.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface TableSerializable {
    /**
     * The name of the implementation that will be generated. It should be a
     * valid/unique java qualifier name
     * @return
     */
    String name();
    
}
