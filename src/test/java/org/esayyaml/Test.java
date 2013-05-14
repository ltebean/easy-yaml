package org.esayyaml;

import junit.framework.TestCase;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @author ltebean
 */
public class Test extends TestCase {

    public void testApp() throws Exception {
        InputStream input = this.getClass().getResourceAsStream("/test.yaml");
        Yaml yaml=new Yaml(input);

        System.out.println(yaml.get("spouse.name",String.class));

        List<Map<String,Object>> children=yaml.get("children",List.class);
        System.out.println(children);

        Map<String,Object> firstChild=yaml.get ("children[0]",Map.class);
        System.out.println(firstChild.get("name"));

    }
}
