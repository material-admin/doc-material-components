<!--docs:
title: "<component name>"
layout: detail
section: components
excerpt: "<Platform name> <component name>"
latest_update: "<date of last update>"
iconId:
path: /
api_doc_root:
-->

**Instructions to authors:**
* _Copy this template into your repo._
* _Replace text \<in angle brackets\> with the appropriate items from your component._
* _Add metadata in the top comment structure for Material.io site integration. Do not add `path` information &ndash; the usage docs should remain on one level_
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

# \<Component name\>

Start with a concise (1-2 sentence) description of the component.

* Copy the exact summary from the design article.
* Do not use the name of the component's class or implementation.
* Link the first mention of the component (e.g., "Button") to the design article.
* If the component is known by an alias on your platform, include that in the description, e.g. "... Ripples are known as 'Ink' in MDC-iOS."

If there are any component types, list them here in an unordered bulleted list.

* Use the same ordering as in the design article.
* Link each item in the list to the corresponding type section below. (If a section is called "Foo The Bar", then the anchor to link to is `#foo-the-bar`.)

Insert an image showing the component or all the component types.

* If no such image exists, file a bug and add a TODO with the bug in an HTML comment in the source.


## Using \<Component name\>

Include the following sentence:
   "Update your IDE and your Material Components library to the latest version if you are using Material Components for the first time."


Include any usage instructions that are common to all types. If your platform includes more complete documentation elsewhere, (e.g., a "Getting Started" page), include a link to it here.

If installation instructions are required, first summarize the requirement in 1-2 sentences and then give detailed instructions in a collapsable section.

If all types use exactly the same list of API docs/source location links, or if there is a common set of links due to a superclass/etc, then include them here instead of repeating them in each type section.

### \<Component name\> anatomy

* Insert the a diagram of the component's anatomy. Use the anatomy diagram from the https://material.io/components/ site. If there are type-specific properties, include a diagram for each type. If there are properties specific to a component type, include a diagram and table in that component type's section.
* Add a table of the properties represented by the diagram common to all component types. Limit the property attributes to six items of the most commonly customized attributes.
* Include the following sentence below the table pointing the user to the API doc(s):
    "We recommend using [Material Theming](https://material.io/components/\<component name\>/#theming) to apply your customizations across your application. For a full list of component properties, go to the API docs:"
    * List the link to each component API

### Customizing \<Component name\>

Insert a table that maps the component attribute name with the default theme property (such as "primary color" or "secondary color"), and if the component attribute diverges from the theme baseline.

### Making \<component name\> accessible

List any accessiblity setting or attributes (such as labels), describe how to use them and link to any guidelines on the m.io site (for example, [how to write a good accessibility label for your component](https://material.io/design/usability/accessibility.html#writing))



## \<First component type\>

Start with a concise (1-2 sentence) description of the component type.
* If possible, copy the exact summary from the design article.
* Link the first mention of the component type to the appropriate section of the design article.

Hide the component section by default using the `<details>` tag. Label the hidden section with the `<summary>` tag with the summary "Open for an implementation example and key properties table." 

<details>
<summary><b>Open for an implementation example and a key properties table</b></summary>

Include a list of links to API documentation and source location of the component.

* Use the class/implementation names when linking to the API docs.
* Add other links as necessary if they would help using the component.
Describe how to use this component type in as much detail as necessary.

* If your platform does not support a particular type, include the type but explicitly state that it isn't supported.
* If support is planned, link to the issue tracking that feature request.


### \<First component type\> example

Describe the example in 1-2 sentences.

Include an image of the rendered example.

Include a snippet of source code illustrating the example.

* Remove boilerplate code that is not necessary to understand the example.
* Consider highlighting the most important lines of the example.


### Key properties

* If the component type uses terminology that differs from the other types, add a diagram of the component labeling key properties/attributes/CSS classes. Create the diagram in Figma if the diagram does not already exist.
* List the key properties/attributes/CSS classes of the component in a table.
   * The first column is the property's name as used in the design article.
   * The second column is the property's identifier in code.
   * The third column is a short description of the property.
   * If there are several related classes used together for the component, list their properties in separate tables.
   * Only list up to six of the _most important properties_ for configuring and theming the component—the full list of properties should be in the component's API docs.


</details>

## \<Second component type\>

<details>
<summary><b>Open for an implementation example and a key properties table</b></summary>

...


### \<Second component type\> example

...


### Key properties

...


</details>

_Continue describing the rest of the component types as necessary._

