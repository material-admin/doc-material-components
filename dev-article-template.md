<!--docs:
title: ""
layout: detail
section: components
excerpt: "This is the template for the developer usage article for material.io."
iconId:
path: /
api_doc_root:
initial_release:
-->
<!--initial_release field required with first platform version supported -->
<!-- this is a usage article template for the material.io developer site.
<!--
Replace all instances of '<>' with your content (such as the component name you usually use)

Replace all uses of block quotes with relevant content.
-->

# \[Canonical component name\]

Add a concise (1-2 sentence) description of the component here starting with the one-line definition from the design/guidance page. The corresponding design document should have a full description.

Add a link to the corresponding design page that the component (helps) implement.

[\<Component cannonical name\>](https://material.io/components/<component>)

If there are component variants, list them here and link to the local anchor link for its section.

Insert any related graphics (such as a graphic showing all variants of this component): show instead of say. If there is no graphic available, skip this. 

<img src="" alt="Include a graphic here with all the variants for this component. Insert a description of the graphic and any variant of the principle component variant it implements.">

## Using \[Component Name \]

If there are any instructions on using the component that applies to all component variants (for example, installation or theming), include them here.

* Use an ordered list for ordered steps (`1.`)
* Use an unorered list for steps that have no particular order (`* `)

If there is a separate page that has instructions, link to that page.


### \[Component section\]
Divide the component into its variants, preferably as described in the [material.io/components] pages.


For example chips](https://material.io/components/chips/) is divided into the following 2nd tier (`##` header) sections based on its variants:

* Input chip
* Choice chip
* Filter clip
* Action clip

Each section should have a 2nd tier header. Add 1-2 sentences from the material.io website that describes when and how to use the component.

**Important** If your platform does not support a particular variant, include the variant but EXPLICITLY STATE THAT IT ISN'T SUPPORTED. Consider including a link to library that does support the variant.


### \[Component Example\] example

The component example header should be one level below the component section header.

The Example section should have the following:
* 1-2 sentences to describe the example
* An image rendering whatever sample code is included
* A list of links to the applicable API(s) listed from highest level to lowest level: include both developer source (e.g., [developer.android.com], or as available) and GitHub source
* Provide example source code that can generate the example in the image. Mention any themes/settings used
