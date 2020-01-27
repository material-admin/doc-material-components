<!--docs:
title: "Cards"
layout: detail
section: components
excerpt: "<platform> Cards"
ide_version: "<cIDE name> <compatible IDE version and build number>"
material_package_version: "<compatible Material platform package version number>"
iconId:
path: /
api_doc_root:
-->

_**Instructions**_
* [Using cards](#using-cards)
    * Add a link under [Using cards](#using-cards) to your getting started page if you have one
    * Insert [installation](#installation) and [theming](#theming) as appropriate for your platform
    * Insert any additional instructions that apply to your platform with a separte level 3 header
    * If you have no getting started links or instructions, delete the [Using cards](#using-cards) sections
* [Elevated](#elevated-card) ane [Outlined](#outlined-card) sections
    * Add links to your platform 



# Cards

[Cards](https://material.io/components/cards/) contain content and actions about a single subject.

A card can be one of two types:
1. [Elevated](#elevated-card)
1. [Outlined](#outlined-card)

![Elevated and Outlined cards wtih a secondary title and two actions: Action 1 and Action 2 in purple](assets/cards-generic.png) 

[`mdc-card` API](#mdc-card-api)

## Using cards
Before you can use a cards, you will need to install and import the following:

* Install the Material cards component
* Import JavaScript


###Install the Material card component
Install the `mdc-card` component before including it in your source.

**`mdc-card`**
```bash
npm install @material/card
```
### Import JavaScript

You can optionally add a JavaScript ripple effect (see [MDC Ripple](https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple)) to components inside yourcards by importing and then instantiating `MDCRipple` in your `*.js` file. See the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md) for more information.

To bundle your `*.js` file, go to the [quickstart page](https://github.com/material-components/material-components-web/blob/master/docs/getting-started.md#quick-start-cdn).

<details><summary><b>Expand for instructions to add JavaScript</b></summary>

```js
import {MDCRipple} from '@material/ripple';

const selector = '.mdc-button, .mdc-icon-button, .mdc-card__primary-action';
const ripples = [].map.call(document.querySelectorAll(selector), function(el) {
  return new MDCRipple(el);
});
```

</details>


### Making cards accessible

Web's card component APIs support labeling for accessibility. To use labels...

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).

### Sass mixins

Use Sass mixins when you want to customize the look and feel of your cards. Go to [sass-lang.com](https://sass-lang.com/install) for installation instructions.

<details><summary><b>Expand for instructions to use Sass mixins to customize your <code>mdc-card</code> or <code>mdc-icon-button</code></b></summary>

Before using Sass mixins for your project you will need to do the following:

* Add the Sass package to your `*.json file` under `devDependencies`:
```json
"devDependencies": {
  "sass": "^1.24.3"
}
```

* Add a `.sassrc.js` file to your project root directory:

```js
const path = require("path");

const CWD = process.cwd();

module.exports = {
  includePaths: [path.resolve(CWD, "node_modules"), path.resolve(CWD, "src")]
};
```
</details>

Import base styles of card into your `*.scss` stylesheet using :

<details><summary><b>Expand for theming instructions for <code>mdc-card</code>.</b></summary>

**mdc-card**
```scss
@use '@material/card/mdc-card';
```

```scss
@use '@material/card/mixins' as card;

.card-instance {
  @include card.container-fill-color(orange);
  @include card.icon-color(green);
  // ...
}
```

<img src="assets/web-sass-mixins-example.png" alt="Contained card with orange fill and green icon ">

#### Sass mixins for `mdc-card`

The following mixins are available to customize your `mdc-card` instance.

Mixin | Description
---|---
`mdc-card-fill-color($color)` | Sets the fill color of a card.
`mdc-card-outline($color, $thickness)` | Sets the color and thickness of a card's outline (but does _not_ remove its shadow).
`mdc-card-shape-radius($radius, $rtl-reflexive)` | Sets the rounded shape to card with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`mdc-card-media-aspect-ratio($x, $y)` | Maintains the given aspect ratio on a `mdc-card__media` subelement by dynamically scaling its height relative to its width.

## Elevated card
 
On mobile, an [elevated card’s](https://material.io/components/cards/#specs) default elevation is 1dp, with a raised dragged elevation of 8dp.

### Elevated card example

Source code API:
* \<platform component name\>
  * [Class definition](https://)
  * [GitHub source](https://github.com/material-components/)


The following example shows an elevated card. The card has a title, a secondary title, text, and two actions: Action 1 and Action 2 in purple (#6200EE).

<img src="assets/<platform>-elevated-card.png" alt="elevated card example for <platform> showing ...">

```
<source code here>
The source code example should display as per the interactive example (https://material.io/components/cards/#) with supporting text and Buttons:
* Display two elevated cards, for each card
* Display a card title "Card title 1" for one card and "Card title 2" for the other
* Display a secondary title "Secondary text" with an opacity of 60%
* Display text reading "Greyhound divisively hello coldly wonderfully marginally far upon excluding." with an opacity of 60%
* Display two actions, "Action 1" and "Action 2" with two text buttons
* Display the sample images ![sample card image of yellow and red tulips](assets/card-sample-image.jpg) and ![sample card image of red and yellow apples](assets/card-sample-image-2.jpg)
* Allow the cards to be moveable.
```

### Key properties

![\<Placeholder diagram of elevated card attributes. Replace this text if/when there is an approved diagram\>](assets/card-anatomy.png)

**1. Elevated card attributes**

1. **Container** 
2. **Thumbnail [optional]** 
3. **Header text [optional]** 
4. **Subhead [optional]** 
5. **Media [optional]** 
6. **Supporting text [optional]** 
7. **Buttons [optional]** <
8. **Icons [optional]** 

<details>
<summary><b>Container</b> attributes</summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Container fill color| |
Container ink color | |
Container shape radius | |
Container outline color | |
Container outline width | | 
Container horzontal padding | | 
Container elevation | |


</details>

<details>
<summary><b>Thumbnail</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</details>

<details>
<summary><b>Header text</b> attributes (optional)</summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Text label | |  
Text color | |
Typography | |


</details>

<details>
<summary><b>Subhead</b> attributes (optional)</summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Text label | |  
Text color | |
Typography | |


</details>

<details>
<summary><b>Media</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |




</details>

<details>
<summary><b>Supporting text</b> attributes (optional)</summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Text label | | 
Text color | |
Typography | |

</details>

<details>
<summary><b>Button</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |




</details>

<details>
<summary><b>Icon</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |




</details>


## Outlined card
 
On desktop and mobile, [outlined cards](https://material.io/components/cards/#specs) can have a resting elevation of 0dp. They elevate to 4dp on hover.

### Outlined card example

Source code API:
* \<platform component name\>
  * [Class definition](https://)
  * [GitHub source](https://github.com/material-components/)


The following example shows an outlined card. The card has a title, a secondary title, text, and two actions: Action 1 and Action 2 in purple (#6200EE).


<img src="assets/<platform>-outlined-card.png" alt="outlined card example for <platform> showing ...">

```
<source code here>
The source code example should display as per the interactive example (https://material.io/components/cards/#) with supporting text and Buttons:
* Display an outlined card with an outline of 60% opacity
* Display a card title "Card title"
* Display a secondary title "Secondary text" with an opacity of 60%
* Display text reading "Greyhound divisively hello coldly wonderfully marginally far upon excluding." with an opacity of 60%
* Display two actions, "Action 1" and "Action 2" with two text buttons
* Display the sample image ![sample card image of yellow and red tulips](assets/card-sample-image.jpg)
* Make the card selectable with a "favorites" icon

```

### Key properties

![\<Placeholder diagram of outlined card  attributes. Replace this text if/when there is an approved diagram\>](assets/card-anatomy.png)

**1. Outlined card attributes**

1. **Container** 
2. **Thumbnail [optional]** 
3. **Header text [optional]** 
4. **Subhead [optional]** 
5. **Media [optional]** 
6. **Supporting text [optional]** 
7. **Buttons [optional]** 
8. **Icons [optional]** 

<details>
<summary><b>Container</b> attributes</summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Container fill color| |
Container ink color | |
Container shape radius | |
Container outline color | |
Container outline width | | 
Container horzontal padding | | 
Container elevation | | 

</details>

<details>
<summary><b>Thumbnail</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |


</details>

<details>
<summary><b>Header text</b> attributes (optional)</summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Text label | N/A |  N/A
Text color | |
Typography | |


</details>

<details>
<summary><b>Subhead</b> attributes (optional)</summary>

Design Attribute | Theme value | Equivalent Sass mixin attribute
---|---|---
Text label | N/A |  N/A
Text color | |
Typography | |




</details>

<details>
<summary><b>Media</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</details>

<details>

<summary><b>Supporting text</b> attributes (optional)</summary>

|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</details>

<details>
<summary><b>Button</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |




</details>

<details>
<summary><b>Icon</b> attributes (optional)</summary>


|  | Attribute | Related method(s) | Default value |
|---|---|---|---|
|Desc. 1 | | | |



</details>



## Theming Cards

Cards support [Material Theming](https://material.io/components/cards/#theming) and can be customized in terms of color, typography and shape.

### Card theming example

API and source code

* `\<card classes\>`
  * [Class definition](https://)
  * [GitHub source](https://github.com/material-components/)

_Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_
```
* Display an outlined card 
* Display a card title "Card title"
* Display a secondary title "Secondary text"
* Display text reading "Greyhound divisively hello coldly wonderfully marginally far upon excluding."
* Display two actions, "Action 1" and "Action 2" with two text buttons
* Display the sample image ![sample card image of yellow and red tulips](assets/card-sample-image.jpg)
* Make the card checkable with a "favorites" icon

```
* Make the card checkable with a "favorites" icon

## `mdc-card` API

## Basic Usage

### HTML Structure

```html
<div class="mdc-card">
  <!-- ... content ... -->
</div>
```

> _NOTE_: MDC Card is designed to accommodate a wide variety of use cases.
> See the [Card Contents](#card-contents) section for information on helpers for specific types of content within cards.

### Styles

```css
@import "@material/card/mdc-card";
```

In order to remain general-purpose and support e.g. images spanning the full width of the card, MDC Card does not
include padding styles on the root element. When adding free-form text content to cards, padding should be set to
`16px`:

```css
.my-card-content {
  padding: 16px;
}
```

> _NOTE_: MDC Card's predefined classes for content areas (e.g. `mdc-card__actions`) take care of their own padding.

By default, cards expand horizontally to fill all available space, and vertically to fit their contents.
If you'd like to maintain a consistent width and height across cards, you'll need to set it in your styles:

```css
.my-card {
  height: 350px;
  width: 350px;
}
```

You can also place cards within layout containers, such as [MDC Layout Grid](../mdc-layout-grid)
or CSS Flexbox or Grid.

### JavaScript

MDC Card itself does not require JavaScript. However, if you place interactive components inside your cards,
you may want to instantiate ripples or other components. For example:

```js
import {MDCRipple} from '@material/ripple';

const selector = '.mdc-button, .mdc-icon-button, .mdc-card__primary-action';
const ripples = [].map.call(document.querySelectorAll(selector), function(el) {
  return new MDCRipple(el);
});
```

> _NOTE_: If your card includes any [icon button toggles](../mdc-icon-button#icon-button-toggle), you will want to
> instantiate `MDCIconButtonToggle` instead of `MDCRipple`.

## Variants

### Outlined Card

By default, cards are elevated with no outline. You can render unelevated outlined cards instead by adding the
`mdc-card--outlined` modifier class.

```html
<div class="mdc-card mdc-card--outlined">
  <!-- ... content ... -->
</div>
```

### Card Contents

MDC Card can be used for a wide variety of use cases, but it includes styles for a few common ones.

#### Primary Action

If a majority of the card (or even the entire card) should be actionable, you can add the `mdc-card__primary-action`
class to the region to give it MDC Ripple styles. You should also assign `tabindex="0"` to ensure it can also be
interacted with via keyboard.

```html
<div class="mdc-card">
  <div class="mdc-card__primary-action" tabindex="0">
    <!-- content within actionable area -->
  </div>
  <!-- ... content ... -->
</div>
```

> _NOTE_: We recommend avoiding adding other actionable items within `mdc-card__primary-action`, due to the overlapping
> effect of multiple nested elements with ripple and states applied at once.

#### Rich media

This area is used for showing rich media in cards, and optionally as a container. Use the `mdc-card__media` CSS class
and the [optional modifier classes](#css-classes).

```html
<div class="my-card__media mdc-card__media mdc-card__media--16-9">
  <div class="mdc-card__media-content">Title</div>
</div>
```

```css
.my-card__media {
  background-image: url("pretty.jpg");
}
```

#### Actions

This area is used to show different actions the user can take, typically at the bottom of a card.
It's often used with [buttons](../mdc-button):

```html
<div class="mdc-card__actions">
  <button class="mdc-button mdc-card__action mdc-card__action--button">
    <div class="mdc-button__ripple"></div>
    <span class="mdc-button__label">Action 1</span>
  </button>
  <button class="mdc-button mdc-card__action mdc-card__action--button">
    <div class="mdc-button__ripple"></div>
    <span class="mdc-button__label">Action 2</span>
  </button>
</div>
```

It can also be used with [icon buttons](../mdc-icon-button):

```html
<div class="mdc-card__actions">
  <button class="mdc-icon-button mdc-card__action mdc-card__action--icon"
     aria-pressed="false"
     aria-label="Add to favorites"
     title="Add to favorites">
   <i class="material-icons mdc-icon-button__icon mdc-icon-button__icon--on">favorite</i>
   <i class="material-icons mdc-icon-button__icon">favorite_border</i>
  </button>
  <button class="material-icons mdc-icon-button mdc-card__action mdc-card__action--icon" title="Share">share</button>
  <button class="material-icons mdc-icon-button mdc-card__action mdc-card__action--icon" title="More options">more_vert</button>
</div>
```

Be sure to include the `mdc-card__action` class on every action for correct positioning. In addition, _button_ icons
should use the `mdc-card__action--button` class, and _icon_ actions should use the `mdc-card__action--icon` class.

To have a single action button take up the entire width of the action row, use the `--full-bleed` modifier on the row:

```html
<div class="mdc-card__actions mdc-card__actions--full-bleed">
  <a class="mdc-button mdc-card__action mdc-card__action--button" href="#">
    <div class="mdc-button__ripple"></div>
    <span class="mdc-button__label">All Business Headlines</span>
    <i class="material-icons mdc-button__icon" aria-hidden="true">arrow_forward</i>
  </a>
</div>
```

To display buttons _and_ icons in the same row, wrap them in `mdc-card__action-buttons` and `mdc-card__action-icons`
elements:

```html
<div class="mdc-card__actions">
  <div class="mdc-card__action-buttons">
    <button class="mdc-button mdc-card__action mdc-card__action--button">
      <div class="mdc-button__ripple"></div>
      <span class="mdc-button__label">Read</span>
    </button>
    <button class="mdc-button mdc-card__action mdc-card__action--button">
      <div class="mdc-button__ripple"></div>
      <span class="mdc-button__label">Bookmark</span>
    </button>
  </div>
  <div class="mdc-card__action-icons">
   <button class="material-icons mdc-icon-button mdc-card__action mdc-card__action--icon" title="Share">share</button>
    <button class="material-icons mdc-icon-button mdc-card__action mdc-card__action--icon" title="More options">more_vert</button>
  </div>
</div>
```

##### Icons

We recommend using [Material Icons](https://material.io/tools/icons/) from Google Fonts:

```html
<head>
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
</head>
```

However, you can also use SVG, [Font Awesome](https://fontawesome.com/), or any other icon library you wish.

#### Combined Example

The following is an example incorporating all of the above elements:

```html
<div class="mdc-card">
  <div class="mdc-card__primary-action">
    <div class="mdc-card__media mdc-card__media--square">
      <div class="mdc-card__media-content">Title</div>
    </div>
    <!-- ... additional primary action content ... -->
  </div>
  <div class="mdc-card__actions">
    <div class="mdc-card__action-buttons">
      <button class="mdc-button mdc-card__action mdc-card__action--button">
        <div class="mdc-button__ripple"></div>
        <span class="mdc-button__label">Action 1</span>
      </button>
      <button class="mdc-button mdc-card__action mdc-card__action--button">
        <div class="mdc-button__ripple"></div>
        <span class="mdc-button__label">Action 2</span>
      </button>
    </div>
    <div class="mdc-card__action-icons">
      <button class="material-icons mdc-icon-button mdc-card__action mdc-card__action--icon" title="Share">share</button>
      <button class="material-icons mdc-icon-button mdc-card__action mdc-card__action--icon" title="More options">more_vert</button>
    </div>
  </div>
</div>
```

## Style Customization

### CSS Classes

CSS Class | Description
--- | ---
`mdc-card` | Mandatory. The main card element.
`mdc-card--outlined` | Optional. Removes the shadow and displays a hairline outline instead.
`mdc-card__primary-action` | Optional. The main tappable area of the card. Typically contains most (or all) card content _except_ `mdc-card__actions`. Only applicable to cards that have a primary action that the main surface should trigger.
`mdc-card__media` | Optional. Media area that displays a custom `background-image` with `background-size: cover`.
`mdc-card__media--square` | Optional. Automatically scales the media area's height to equal its width.
`mdc-card__media--16-9` | Optional. Automatically scales the media area's height according to its width, maintaining a 16:9 aspect ratio.
`mdc-card__media-content` | Optional. An absolutely-positioned box the same size as the media area, for displaying a title or icon on top of the `background-image`.
`mdc-card__actions` | Optional. Row containing action buttons and/or icons.
`mdc-card__actions--full-bleed` | Optional. Removes the action area's padding and causes its only child (an `mdc-card__action` element) to consume 100% of the action area's width.
`mdc-card__action-buttons` | Optional. A group of action buttons, displayed on the left side of the card (in LTR), adjacent to `mdc-card__action-icons`.
`mdc-card__action-icons` | Optional. A group of supplemental action icons, displayed on the right side of the card (in LTR), adjacent to `__action-buttons`.
`mdc-card__action` | Optional. An individual action button or icon.
`mdc-card__action--button` | Optional. An action button with text.
`mdc-card__action--icon` | Optional. An action icon with no text. We recommend using [Material Icons](https://material.io/tools/icons/) from Google Fonts.

### Sass Mixins

Mixin | Description
--- | ---
`mdc-card-fill-color($color)` | Sets the fill color of a card.
`mdc-card-outline($color, $thickness)` | Sets the color and thickness of a card's outline (but does _not_ remove its shadow).
`mdc-card-shape-radius($radius, $rtl-reflexive)` | Sets the rounded shape to card with given radius size. Set `$rtl-reflexive` to true to flip radius values in RTL context, defaults to false.
`mdc-card-media-aspect-ratio($x, $y)` | Maintains the given aspect ratio on a `mdc-card__media` subelement by dynamically scaling its height relative to its width.
