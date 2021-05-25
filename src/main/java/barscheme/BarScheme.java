
package barscheme;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "username",
    "old"
})
public class BarScheme {

    @JsonProperty("username")
    private String username;
    @JsonProperty("old")
    private int old;

    /**
     * 
     * @return
     *     The username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The old
     */
    @JsonProperty("old")
    public int getOld() {
        return old;
    }

    /**
     * 
     * @param old
     *     The old
     */
    @JsonProperty("old")
    public void setOld(int old) {
        this.old = old;
    }

}
