# bpp.shopify
shopify adaptor to [bpp-shell](https://github.com/venkatramanm/bpp.shell) 
# How to connect a shopify store to a beckn network.

In shopify 

1. Store settings->apps and sales channel->Develop apps
    1. create an app. 
    2. give permissions for all required access scopes.
    3. Install the app

Adaptor

Generate your adaptor using appropriate values of group and artifact
1.  mvn archetype:generate -DarchetypeGroupId=com.github.venkatramanm.swf-all -DarchetypeArtifactId=swf-bpp-archetype -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=io.becknprotocol -DartifactId=shopify.beckn -Dadaptor=bpp.shopify -Dversion=1.0-SNAPSHOT
1.
