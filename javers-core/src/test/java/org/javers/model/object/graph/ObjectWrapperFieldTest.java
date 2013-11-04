package org.javers.model.object.graph;

import org.javers.model.mapping.EntityFactory;
import org.javers.model.mapping.FieldBasedPropertyScanner;
import org.javers.model.mapping.type.TypeMapper;
import org.junit.Before;

import static org.javers.test.builder.TypeMapperTestBuilder.typeMapper;

/**
 * @author bartosz walacik
 */
public class ObjectWrapperFieldTest extends ObjectWrapperTest {

    @Before
    public void setUp() {
        TypeMapper mapper = typeMapper().registerAllDummyTypes().build();
        FieldBasedPropertyScanner scanner = new FieldBasedPropertyScanner (mapper);
        entityFactory = new EntityFactory(scanner);
    }
}
