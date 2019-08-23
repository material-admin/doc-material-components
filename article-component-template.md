<!-- this is a draft of a an article template for the material.io developer site.
This template is based on the design article template at 
https://spec.googleplex.com/m2-spec-guide/authoring-content/component-article-template.html-->

# \[Component Name\]

Add a concise description of the component here. for example:

> Buttons allow users to take actions and make choices using a tap to press the button.
> Buttons can be customized to meet your style requirements.

Insert any related graphics.

<!-- Note that the iOS team has added a TOC to their repo, and it appears to be from https://github.com/jonschlinkert/markdown-toc -->
<!-- toc -->

<!-- design-and-api -->

## Overview of \[Component name\] (Object: Required)


Summary statement for this object goes here. A summary statement should be a short two to three line statement about the object and the subsections within it.

Example:
> `Material Button` is a customizable button that supports several built-in styles to show different actions and different levels of emphasis that include:
> * **raised button**: A rectangular material button that lifts and displays ink reactions upon button press
> * **unelevated button**: A button made of ink that displays ink reactions upon button press but does not lift when the button pressed is released.

## Installation/Importation (Object: optional according to platform)

If the component needs to be installed or imported, include the instructions in a numbered list.

example:
> ### Installation Using CocoaPods
> 1. Add the following to your `Podfile`:
> ```bash
>    pod 'MaterialComponents/Buttons'
>    ```
> 1. Run the `install` command:
> ```bash
>    pod install
>    ```
