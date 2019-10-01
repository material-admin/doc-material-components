<!--docs:
title: "Example article: Web button"
layout: detail
section: components
excerpt: "This is an example of the Web Material Button developer article for material.io. It uses the template from [../article-component-template.md]"
iconId:
path: /
api_doc_root:
@import "@material/button/mdc-button";
-->
# Buttons (`mdc-button` and `mdc-icon-button`)

The buttons component for the material.io web platform consists of two implementations:
* `mdc-button` is a customizable button component with updated visual styles. This button component has several built-in styles to support different levels of emphasis, as typically any UI will contain a few different buttons to indicate different actions.
* `mdc-icon-button` is a variant of `mdc-button` that allows users to select and toggle a button from a group of buttons with a single tap.

For more information on the buttons component, go to the material.io [Buttons](http://material.io/components/buttons) page.

## [`mdc-button` variants](#using-mdc-button)

* [Text (flat) button](#text-button)
* [Outlined button](#outlined-buton)
* [Contained (raised) button](#contained-raised-button)

## [`mdc-icon-button`](#using-mdc-icon-button)
* [Toggle (icon) button](#toggle-icon-button)

<img src="images/buttons-types-all.png" title="Image showing 4 different button types: 1. text button, 2. outlined button, 3. contained button, 4, toggle button">


## Using `mdc-button`

The `mdc-button` component provides an implementation of Material Design’s button component without the toggle capability.

### Install `mcd-button`
Install the `mdc-button` component before including it in your source.

```bash
npm install @material/buttons
```
### Add a theme (style)
The `mdc-button` component works with themes (styles). Import a style into your stylesheet to apply it to your website, including buttons:

```css
@import "@material/button/mdc-button";
```
### Import JavaScript button effects
You can also add a JavaScript ripple effect (see [MDC Ripple](https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple)) to your buttons by importing then instantiating `MCDRipple`. See the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md) for more information on importing JavaScript.

```js
import {MDCRipple} from '@material/ripple';

const buttonRipple = new MDCRipple(document.querySelector('.mdc-button'));
```

### Add an icon to `mdc-button`

Add an icon to your `mdc-button` instance using the following steps:

1. In your HTML file, reference the font library you would like to use (we recommend the [Material Icons](https://material.io/tools/icons/) from Google Fonts):
    ```HTML
    <head>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    ```
1. Include the `mcd-button__icon` class inside your button element. Set the attribute `area-hidden="true"`.
    **Note** The location of the icon element determines if the icon comes before (*leading*) or after (*trailing icon*) the text.

    **Example using [Material Icons](https://material.io/tools/icons/)**
    ```HTML
    <button class="mdc-button">
      <i class="material-icons mdc-button__icon" aria-hidden="true">favorite</i>
      <span class="mdc-button__label">Button</span>
    </button>
    ```
    **Example using SVG Icons**
    ```html
    <button class="mdc-button">
      <svg class="mdc-button__icon" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" viewBox="...">
        /*...*/
      </svg>
      <span class="mdc-button__label">Button</span>
    </button>
    ```


### Related APIs

[Source code](https://github.com/material-components/material-components-web/tree/master/packages/mdc-button): GitHub source repository<br>
[Demo site](https://material-components.github.io/material-components-web-catalog/#/component/button): You can use this site to generate basic HTML source for button variants, such as text, outlined, raised, and unelevated.

**CSS Classes**

| CSS Class | Description |
|---|---|
| `mdc-button` | Mandatory. Defaults to a text button that is flush with the surface.|
| `mdc-button--raised`	| Optional. Styles a contained button that is elevated above the surface. |
| `mdc-button--unelevated` |	Optional. Styles a contained button that is flush with the surface. |
| `mdc-button--outlined` |	Optional. Styles an outlined button that is flush with the surface. |
| `mdc-button--dense` |	Optional. Makes the button text and container slightly smaller. |
| `mdc-button__label` |	Optional for buttons with leading or no icon, required for buttons with trailing icons. Indicates the element containing the button’s text label. |
| `mdc-button__icon` |	Optional. Indicates the element containing the button’s icon. |



### Text (flat) button

Text buttons are typically used for less-pronounced actions, including those located:
* In dialogs
* In cards
In cards, text buttons help maintain an emphasis on card content.


<img src="images/ios-text-button.gif">

element | class | class description
---|---|---
button | `mdc-button` | text button
span | `mdc-button__label` | applies the text to the button

#### Text button example

```html
 <button class="mdc-button">
  <span class="mdc-button__label">Button</span>
</button>
```

### Outlined button

Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

<img src="images/ios-outlined.gif">

#### Outlined button example

```html
 <button class="mdc-button--outlined">
  <span class="mdc-button__label">Button</span>
</button>
```

### Contained (raised) button

Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

<img src="images/ios-contained.gif">

#### Contained button example

<div class="iframely-embed"><div class="iframely-responsive" style="padding-bottom: 56.2493%;"><a href="https://gist.github.com/jweir/2719090" data-iframely-url="//cdn.iframe.ly/bbI0"></a></div></div><script async src="//cdn.iframe.ly/embed.js" charset="utf-8"></script>

```html
 <button class="mdc-button--elevated">
  <span class="mdc-button__label">Button</span>
</button>
```

## Using `mdc-icon-button`

The `mdc-icon-button` component provides an implementation of Material Design’s [toggle button](https://material.io/components/buttons/#toggle-button) with icons.

Toggle buttons can be used to group related options. To emphasize groups of related toggle buttons, a group should share a common container.
<img src="images/button-toggle.png">
<img src="images/button-icon-toggle.png">

### Install `mdc-icon-button`
Install the `icon-button` before including it in your source.
    ```bash
    npm install @material/icon-button
    ```
### Add a theme (style)
The `mdc-icon-button` component works with themes (styles). Import a style into your stylesheet to apply it to your website, including icon buttons:
    ```js
    @import "@material/icon-button/mdc-icon-button";
    ```

### Import JavaScript button effects
You can also add a JavaScript ripple effect (see [MDC Ripple](https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple)) to your icon buttons by importing then instantiating `MCDRipple`. See the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md) for more information on importing JavaScript.

```js
import {MDCRipple} from '@material/ripple';

const iconButtonRipple = new MDCRipple(document.querySelector('.mdc-icon-button'));
iconButtonRipple.unbounded = true;
```
### Add an icon to an `mdc-icon-button` instance

Add an icon to your `mdc-icon-button` instance using the following steps:

1. In your HTML file, reference the font library you would like to use (we recommend the [Material Icons](https://material.io/tools/icons/) from Google Fonts):
    ```HTML
    <head>
      <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    ```
1. Include the `mcd-icon-button__icon` class inside your icon button element.
  You can set the default `pressed` state with the attribute `aria-pressed`. If a toggle button default is `pressed` (`aria-pressed="true"`), you will need to add `mdc-icon-button__icon--on` to the to the class `mdc-icon-button__icon`.

    **Example using [Material Icons](https://material.io/tools/icons/)**
    ```HTML
    <button id="add-to-favorites"
      class="mdc-icon-button"
      aria-label="Add to favorites"
      aria-hidden="true"
      aria-pressed="false">
     <i class="material-icons mdc-icon-button__icon mdc-icon-button__icon--on">favorite</i>
     <i class="material-icons mdc-icon-button__icon">favorite_border</i>
    </button>
    ```
    **Example using SVG Icons**
    ```html
    <button id="star-this-item"
       class="mdc-icon-button mdc-icon-button--on"
       aria-label="Unstar this item"
       aria-hidden="true"
       aria-pressed="true">
       <svg class="mdc-icon-button__icon">
         /*...*/
       </svg>
       <svg class="mdc-icon-button__icon mdc-icon-button__icon--on">
         /*...*/
      </svg>
    </button>
    ```
    **Example using toggle button with an image**
    ```HTML
    <button id="star-this-item"
      class="mdc-icon-button mdc-icon-button--on"
      aria-label="Unstar this item"
      aria-hidden="true"
      aria-pressed="true">
      <img src="" class="mdc-icon-button__icon"/>
      <img src="" class="mdc-icon-button__icon mdc-icon-button__icon--on"/>
    </button>
    ```

## Related APIs

[Source code](https://github.com/material-components/material-components-web/tree/master/packages/mdc-icon-button): GitHub source repository</br>
[Demo site](https://material-components.github.io/material-components-web-catalog/#/component/icon-button): You can use this site to see examples of toggled icon buttons.

**CSS classes**

CSS Class |	Description
---|---
mdc-icon-button |	Mandatory.
mdc-icon-button--on	| Apply this class to the root element to indicate if the icon button toggle is in the “on” state.
mdc-icon-button__icon	| Apply this class to each icon element for the icon button toggle.
mdc-icon-button__icon--on	| Apply this class to an icon element to indicate the toggle button icon that represents the “on” icon.
