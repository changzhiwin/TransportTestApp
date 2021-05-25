
package fooschema;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "age"
})
public class FooSchema {

    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The age
     */
    @JsonProperty("age")
    public int getAge() {
        return age;
    }

    /**
     * 
     * @param age
     *     The age
     */
    @JsonProperty("age")
    public void setAge(int age) {
        this.age = age;
    }

}
