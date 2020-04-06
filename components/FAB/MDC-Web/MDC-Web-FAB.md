<!--docs:
title: "Floating action button"
layout: detail
section: components
excerpt: "A floating action button (FAB) represents the primary action of a screen."
iconId: 
path: /catalog/floating-action-button/
-->

# Floating action buttons

A floating action button (FAB) represents the primary action of a screen.

There are three types of FABS:

1. [Regular FABs](#regular-fabs)
2. [Mini FABs](#mini-fabs)
3. [Extended FABs](#extended-fabs)

![Regular FAB example](assets/FAB_types.png)

## Using FABs

A FAB performs the primary, or most common, action on a screen. It appears in front of all screen content, typically as a circular shape with an icon in its center. 

### Installing FABs

```
npm install @material/fab
```

### Styles

```scss

### JavaScript instantiation

The icon button will work without JavaScript, but you can enhance it to have a ripple effect by instantiating `MDCRipple` on the root element.
See [MDC Ripple](../mdc-ripple) for details.

```js
import {MDCRipple} from '@material/ripple';

const iconButtonRipple = new MDCRipple(document.querySelector('.mdc-icon-button'));
iconButtonRipple.unbounded = true;
```

**Note**: See [Importing the JS component](../../docs/importing-js.md) for more information on how to import JavaScript.



### Regular FABs

Regular FABs are FABs that are not expanded and are a regular size.
tHub source]()


## Mini FABs

A mini FAB should be used on smaller screens.

Mini FABs can also be used to create visual continuity with other screen elements.




## Extended FABs

The extended FAB is wider, and it includes a text label.

## API

### CSS classes

### Sass mixes

### Events

