<!--docs:
title: "Material <component>"
layout: detail
section: components
excerpt: "A customizable button <component> with updated visual styles."
iconId: 
path: /catalog/material-<component>/
-->

**Instructions to authors:**
* _Replace text \<in angle brackets\> with the appropriate items from your component._
* _Follow the instructions in each section &ndash; see the [accompanying examples](button-examples) for futher guidance._
* _Delete these instructions before submitting your document_

<!--  20191125 Todo:
* tables for attributes for each type
* (phase II) include anatomy section referencing the material.io/components
    * table referencing anatomy mapping to attributes (test this out per platform for naming that is consistent for all types)
    * try to include a single image from design that diagrams attributes
* What are the best ways to integrate component accessbility features into the template?
* What information do we need to provide the site team to update the components site?

-->
<!--start mio-exclude-->
# \<Component name\>

Start with a concise (1-2 sentence) description of the component.

* Copy the exact summary from the design article.
* Do not use the name of the component's class or implementation.
* Link the first mention of the component (e.g., "Button") to the design article.
* If the component is known by an alias on your platform, include that in the description, e.g. "... Ripples are known as 'Ink' in MDC-iOS."

Insert a hero image selected from spec. For example, the `assets` folder might include an image such as the following for Tabs:
    https://storage.googleapis.com/spec-host/mio-staging%2Fmio-components%2F1584058305895%2Fassets%2F1EQno9oequgSkF7kHM5A802blbxrKl75F%2Ftabs-usage-do1.png


**Contents**

Include TOC here of the major sections with relative links, including:
* [Using \<component name\>](#relative link here)
* [Installing \<component name\> (if available)](#relative link here)
* [Import \<component name\> (if available)](#relative link here)
* [Making \<component name\> accessible](#relative link here)
* [\<First component type\>](#relative link here)
* [\<Second component type\>](#relative link here)
* [\<any additional component types\>](#relative link here)
* [Theming](#theming)

**Note: Do not nest the TOC levels**
<!--end mio-exclude-->
## Using \<component name\>

<!-- Include the following sentence:
   "Update your IDE and your Material Components library to the latest version if you are using Material Components for the first time."
-->


Include any usage instructions that are common to all types. If your platform includes more complete documentation elsewhere, (e.g., a "Getting Started" page), include a link to it here.

If installation instructions are required, first summarize the requirement in 1-2 sentences and then give detailed instructions in a collapsable section.

If all types use exactly the same list of API docs/source location links, or if there is a common set of links due to a superclass/etc, then include them here instead of repeating them in each type section.

### Making \<component name\> accessible

List any accessiblity setting or attributes (such as labels), describe how to use them and link to any guidelines on the m.io site (for example, [how to write a good accessibility label for your component](https://material.io/design/usability/accessibility.html#writing))

### Types


If there are any component types, list them here in a numbered inline list.

* Use the same ordering as in the design article.
* Link each item in the inline list to the corresponding type section below. (If a section is called "Foo The Bar", then the anchor to link to is `#foo-the-bar`.)

Insert an image showing the component or all the component types.

* If no such image exists, file a bug and add a TODO with the bug in an HTML comment in the source.

## \<First component type\>

Start with a concise (1-2 sentence) description of the component type.
* If possible, copy the exact summary from the design article.
* Link the first mention of the component type to the appropriate section of the design article.

### \<First component type\> example
Include a list of links to API documentation and source location of the component.

* Use the class/implementation names when linking to the API docs.
* Add other links as necessary if they would help using the component.
* Describe how to use this component type in as much detail as necessary.
* If your platform does not support a particular type, include the type but explicitly state that it isn't supported.
* If support is planned, link to the issue tracking that feature request.



Describe the example in 1-2 sentences.

Include an image of the rendered example.

Include a snippet of source code illustrating the example.

* Remove boilerplate code that is not necessary to understand the example.
* Consider highlighting the most important lines of the example.
### Anatomy and Key properties

* Call out the anatomy elements in a sentence.
* Insert the a diagram of the component type's anatomy. Use the anatomy diagram from the https://material.io/components/ site.
* Add a table of the design attributes represented by the diagram. Limit the design attributes to six items of the most commonly customized attributes.
* Include the following sentence below the table pointing the user to the API doc(s):
    "We recommend using [Material Theming](https://material.io/components/\<component name\>/#theming) to apply your customizations across your application. For a full list of component properties, go to the API docs:"
    * List the links to each API

#### Styles

Include a table of the theme description for each theme element and the theme's name in your platform. 

## \<Second component type\>

...


### \<Second component type\> example

...


### Anatomy and Key properties

...


_Continue describing the rest of the component types as necessary._

## Theming \<component name\>

Provide a 1-2 sentences saying that Material theming applies to the component:
    "\<Component name\> supports [Material Theming](https://material.io/components/<component name>/#theming) and can be customized in terms of color, typography and shape."

### \<Component name\> theming example

* Provide a screenshot of a coponent type that uses a modified theme that includes changes to:
    * Background color
    * Outline color (if applicable)
    * Font type
    * Font color
    * Component shape (if applicable)


Provide example code that corresponds to the component type screenshot
