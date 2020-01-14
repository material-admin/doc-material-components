<!--docs:
title: "Text field"
layout: detail
section: components
excerpt: "<Platform name> Text field"
ide_version: "<cIDE name> <compatible IDE version and build number>"
material_package_version: "<compatible Material platform package version number>"
iconId:
path: /
api_doc_root:
-->

_**Instructions**_
* Copy this file into the platform folder for this component
* Rename the file to "\<platform\>-text-field.md"
* [Using text field](#using-text-field)
    * Add a link under [Using text field](#using-text-field) to your getting started page if you have one
    * Insert [installation](#installation) and [theming](#theming) as appropriate for your platform
    * Insert any additional instructions that apply to your platform with a separte level 3 header
    * If you have no getting started links or instructions, delete the [Using text field](#using-text-field) sections
* [Filled text](#filled-text) ane [Outlined-text](#outlined-text) sections
    * Add links to your platform 


# Text field

[Text fields](https://material.io/components/text-fields) let users enter and edit text.

The text field class consists of the following types:

* [Filled text](#filled-text)
* [Outlined text](#outlined-text)

<img src="assets/text-field-generic.png" alt="Text field examples of both filled and outlined types, and each type showing both inactive and focused states. The filled text fields show a gray background and a darker gray activation indicator that is purple when focused. The outlined text fields show a clear background and an outline that is purple when focused">

## Using text fields

Text fields allow users to enter text into a UI. They typically appear in forms and dialogs.

### Install the Material text field component

Install the `textfield` component before including it in you source:

<details><summary><b>Expand for installation instructions for <code>textfield</code>.</b></summary>

```bash
npm install @material/textfield
```

</details>

### Import JavaScript effects
You can optinally add a JavaScript [line ripple](https://material.io/components/web/catalog/input-controls/line-ripple/) or [floating label](https://material.io/develop/web/components/input-controls/floating-label/) effect to your text fields by importing and then instantiating `MCDRipple` in your `*.js` file. See the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md) for more information on importing JavaScript.

To bundle your `*.js` file, go to the [quickstart page](https://github.com/material-components/material-components-web/blob/master/docs/getting-started.md#quick-start-cdn).

<details><summary><b>Expand for instructions to add JavaScript effects</b></summary>

```js
import {MDCTextField} from '@material/textfield';

<!-- The following line applies to the `mdc-text-field` class-->
const textField = new MDCTextField(document.querySelector('.mdc-text-field'));

```

### Sass mixins

<details><summary><b>Expand for instructions to use Sass mixins to customize your <code>mdc-text-field</code></b></summary>

Before using Sass mixins for your project you will need to do the following:

* Add the Sass package to your `*.json file` under `devDependencies`:
```json
"devDependencies": {
  "sass": "^1.14.3"
}
````

* Add a `.sassrc.js` file to your project directory:
```js

const path = require("path");

const CWD = process.cwd();

module.exports = {
  includePaths: [path.resolve(CWD, "node_modules"), path.resolve(CWD, "src")]
};
```

* In your `*.scss` file for your application, create an instance of your text field with the Sass mixins settings of your choice. For example, if you have a text field:

```css
.text-field-instance {
  @include mdc-text-field-label-color(orange);
  @include mdc-text-field-label-caret-color(green);
  ...
}
```

<img src="assets/web-sass-mixins-example.png" alt="Example text field instance rendered for an orange label and a green cursor caret">

#### Sass mixins for `mdc-button`

##### Mixins for all text fields

Mixin | Description
--- | ---
`mdc-text-field-ink-color($color)` | Customizes the color of the text entered into the text field.
`mdc-text-field-label-color($color)` | Customizes the text color of the label.
`mdc-text-field-caret-color($color)` | Customizes the color of the cursor caret of the text field.

##### Mixins for filled text field

Mixin | Description
--- | ---
`mdc-text-field-shape-radius($radius, $rtl-reflexive)` | Sets rounded shape to boxed text field variant with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`mdc-text-field-fill-color($color)` | Customizes the background color of the text field.
`mdc-text-field-bottom-line-color($color)` | Customizes the text field bottom line color except the outlined and textarea variants.
`mdc-text-field-hover-bottom-line-color($color)` | Customizes the hover text field bottom line color except the outlined and textarea variants.
`mdc-text-field-line-ripple-color($color)` | Customizes the color of the default line ripple of the text field.

##### Mixins for outlined text field

Mixin | Description
--- | ---
`mdc-text-field-focused-outline-color($color)` | Customizes the outline border color when the text field is focused.
`mdc-text-field-hover-outline-color($color)` | Customizes the outline border color when the text field is hovered.
`mdc-text-field-outline-color($color)` | Customizes the border color of the outlined text field.
`mdc-text-field-outline-shape-radius($radius, $rtl-reflexive)` | Sets rounded shape to outlined text field variant with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.

##### Mixins for text area

Mixin | Description
--- | ---
`mdc-text-field-textarea-shape-radius($radius, $rtl-reflexive)` | Sets rounded shape to text area variant with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`mdc-text-field-textarea-fill-color($color)` | Customizes the color of the background of the textarea.
`mdc-text-field-textarea-stroke-color($color)` | Customizes the color of the border of the textarea.


##### Mixins for text field full width

Mixin | Description
--- | ---
`mdc-text-field-fullwidth-bottom-line-color($color)` | Customizes the fullwidth text field variant bottom line color.

The following mixins are available to customize your `mdc-button` instance.

Mixin | Description
---|---
`mdc-button-container-fill-color($color)` | Sets the container fill color to the given color.
`mdc-button-icon-color($color)` | Sets the icon color to the given color.
`mdc-button-ink-color($color)` | Sets the ink color to the given color, and sets the icon color to the given color unless `mdc-button-icon-color` is also used.
`mdc-button-shape-radius($radius, $rtl-reflexive)` | Sets rounded shape to button with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`mdc-button-horizontal-padding($padding)` | Sets horizontal padding to the given number.
`mdc-button-outline-color($color)` | Sets the outline color to the given color.
`mdc-button-outline-width($width, $padding)` | Sets the outline width to the given number (defaults to 2px) and adjusts padding accordingly. `$padding` is only required in cases where `mdc-button-horizontal-padding` is also included with a custom value.

</details>

### Making text fields accessible

The web platform's text field component APIs supports both label text and helper text for accessibility. 

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).


## Filled text

[Filled text fields](https://material.io/components/text-fields/#filled-text-field) have more visual emphasis than outlined text fields, making them stand out when surrounded by other content and components.

### Filled text example

Source code API:

* `TextInputLayout` 
  * [Class definition]()
  * [GitHub source](https://github.com/material-components/)

The following examples shows a filled text field.


_**Copy the image to your platform's assets folder. Use a screenshot of your render.**_


<img src="assets/.png" alt="filled text field for Android">

```
* The label text should read "Label text"
* The input text should read "Input text"
* The helper text should read "Helper text"
* The text field should have a character counter of up to 20 characters
* The text field should have a "favorite" leading icon
```

### Anatomy and key properties

<img alt="<Placeholder diagram of outlined teld field attributes. Replace this text if/when there is an approved diagram\>" src="assets/text-field-anatomy.png" width=70%>

1. Container
1. Leading icon (optional)
1. Label text
1. Input text
1. Trailing icon (optional)
1. Activation indicator
1. Helper text (optional)

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

</details>


<details>
<summary><b>Leading icon</b> (optional) attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** | | | |
| **Padding** | | | |


</details>


<details>
<summary><b>Label text</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Label text** |  | | |
| **Typography** | | | |
| **Color** | | | |

</details>


<details>
<summary><b>Input text</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Label text** |  | | |
| **Typography** | | | |
| **Color** | | | |

</details>


<details>
<summary><b>Trailing icon</b> (optional) attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** | | | |
| **Padding** | | | |

</details>


<details>
<summary><b>Activation indicator</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Ripple color** | | | |

</details>


<details>
<summary><b>Helper text</b> (optional) attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Label text** |  | | |
| **Typography** | | | |
| **Color** | | | |

</details>

<summary><b>Styles</b></summary>
<br>

|  | Style|
| --- | --- |
| **Default style** | |
| **Icon style** | |

</details>

## Outlined text

[Outlined text fields](https://material.io/components/text-fields/#outlined-text-field) have less visual emphasis than filled text fields. When they appear in places like forms, where many text fields are placed together, their reduced emphasis helps simplify the layout.

### Outlined text example

Source code API:

* `TextInputLayout` 
  * [Class definition]()
  * [GitHub source]()

The following examples shows an outlined text field.

_**Copy the image to your platform's assets folder. Use a screenshot of your render.**_
<img src="assets/.png" alt="outlined text field for Android.">

```
* The label text should read "Label text"
* The input text should read "Input text"
* The error message text should read "Error message" and display the error message
* The text field should have a trailing error icon
```
### Anatomy and key properties

<img alt="<Placeholder diagram of outlined teld field attributes. Replace this text if/when there is an approved diagram\>" src="assets/text-field-anatomy.png" width=70%>

1. Container
1. Leading icon (optional)
1. Label text
1. Input text
1. Trailing icon (optional)
1. Activation indicator
1. Helper text (optional)

<details>
<summary><b>Container</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

</details>


<details>
<summary><b>Leading icon</b> (optional) attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** | | | |
| **Padding** | | | |


</details>


<details>
<summary><b>Label text</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Label text** |  | | |
| **Typography** | | | |
| **Color** | | | |

</details>


<details>
<summary><b>Input text</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Label text** |  | | |
| **Typography** | | | |
| **Color** | | | |

</details>


<details>
<summary><b>Trailing icon</b> (optional) attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** | | | |
| **Padding** | | | |

</details>


<details>
<summary><b>Activation indicator</b> attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Ripple color** | | | |

</details>


<details>
<summary><b>Helper text</b> (optional) attributes</summary>
<br>

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Label text** |  | | |
| **Typography** | | | |
| **Color** | | | |

</details>

<summary><b>Styles</b></summary>
<br>

|  | Style|
| --- | --- |
| **Default style** | |
| **Icon style** | |

</details>

## Theming text fields

Text fields support [Material Theming](https://material.io/components/text-fields/#theming) and can be customized in terms of color, typography and shape.

### Text field theming example

API and source code:

* `\<Component platform API name\>`
    * [Class description](https://)
    * [GitHub source](https://github.com/material-components/)
    
The following example shows filled and outlined text fields with Material Theming.

!["Two text fields, one filled, one outlined, with green/black color theming and cut corners."](assets/button-theming.svg)

<details>
<summary><b>Implementing text field theming</b></summary>

```
Include source code for two side-by-side examples using a green/black color theme similar to the one used in the [Android button example](https://github.com/mingjane-work/doc-material-components/blob/mingjane-doc-branch/button-examples/Android/android-button-example.md):

* Include one filled text field with the following:
    * The label text should read "Label text"
    * The input text should read "Input text"
    * The helper text should read "Helper text"
    * The text field should have a character counter of up to 20 characters
    * The text field should have a "favorite" leading icon
    * The container should have cut corners instead of rounded
* Include one outlined text field with the following:
    * The label text should read "Label text"
    * The input text should read "Input text"
    * The error message text should read "Error message" and display the error message
    * The text field should have a trailing error icon
    * The container should have cut corners instead of rounded
