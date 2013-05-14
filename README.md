
easy-yaml provides an easy-to-use api to access the yaml configuraion.

###Example:

The yaml file:

    name: John Smith
    age: 37
    spouse:
        name: Jane Smith
        age: 25
    children:
        - name: Jimmy Smith
          age: 15
        - name: Jenny Smith
          age: 12
          
In the java code, you can use ognl expression to access the properties defined in the yaml config:

    InputStream input = this.getClass().getResourceAsStream("/test.yaml");
    Yaml yaml = new Yaml(input);
    String name = yaml.getAs("name",String.class);
    String spouseName = yaml.getAs("spouse.name",String.class);
    List<Map<String,Object>> children = yaml.getAs("children",List.class);
    Map<String,Object> firstChildren = yaml.getAs("children[0]",Map.class);




