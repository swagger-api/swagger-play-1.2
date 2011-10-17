# Swagger Play Framework Module

## Overview
This is a project to add swagger to play-framework; an implementation of the Swagger spec.  
You can find out more about both the spec and the framework at http://swagger.wordnik.com.  
For more information about Wordnik's APIs, please visit http://developer.wordnik.com.  

### Prerequisites
You need the following installed and available in your $PATH:

<li>- Play Framework 1.2.3

<li>- Scala 2.8.1  (http://www.scala-lang.org)

### To build

The swagger-play module depends on swagger-core-1.1, which is not in a public repo as of 
now.  Please clone and build that project:

<pre>
git clone git@github.com:wordnik/swagger-core.git

cd swagger-core
ant
</pre>

Get the dependencies for the swagger-play module:

<pre>
play deps
</pre>

after building, copy the swagger-core-1.1.jar into your lib folder:

<pre>
rm lib/swagger-core.*
cp ../swagger-core/build/swagger-core-1.1.jar ./lib
</pre>

Now you can build the module:

<pre>
play build-module
</pre>

