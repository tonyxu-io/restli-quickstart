
package com.example.fortune;

import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.GetRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Dec 19 10:22:47 PST 2019")
public class FortunesGetRequestBuilder
    extends GetRequestBuilderBase<Long, Fortune, FortunesGetRequestBuilder>
{


    public FortunesGetRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Fortune.class, resourceSpec, requestOptions);
    }

}
