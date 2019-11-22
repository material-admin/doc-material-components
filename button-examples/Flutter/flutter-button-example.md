# Buttons

[Buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.

There are four variants of buttons:

* [Text button](#text-button)
* [Outlined button](#outlined-button) 
* [Contained button](#contained-button)
* [Toggle button](#toggle-button)

<!-- TODO(b/1234568): Add example image here when it is available. -->

## Text button

[Text buttons](https://material.io/components/buttons/#text-button) are typically used for less-pronounced actions, including those located:

* In dialogs
* In cards

In cards, text buttons help maintain an emphasis on card content.

In Flutter, text buttons are known as "flat buttons".

* [API docs](https://api.flutter.dev/flutter/material/FlatButton-class.html) for `FlatButton` 
* [Source on GitHub](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/flat_button.dart)
* [`RawMaterialButton`](https://api.flutter.dev/flutter/material/RawMaterialButton-class.html), the widget this widget is based on
* [`Text`](https://api.flutter.dev/flutter/painting/Text-class.html), the text object representing the button label.
* [`TextStyle`](https://api.flutter.dev/flutter/painting/TextStyle-class.html), the style used by the button label.

A flat button is a text label displayed on a (zero elevation) [Material](https://api.flutter.dev/flutter/material/Material-class.html) widget that reacts to touches by filling with color.

Use flat buttons on toolbars, in dialogs, or inline with other content but offset from that content with padding so that the button's presence is obvious. Flat buttons intentionally do not have visible borders and must therefore rely on their position relative to other content for context. In dialogs and cards, they should be grouped together in one of the bottom corners. Avoid using flat buttons where they would blend in with other content, for example in the middle of lists.

Material design flat buttons have an all-caps label, some internal padding, and some defined dimensions. To have a part of your application be interactive, with ink splashes, without also committing to these stylistic choices, consider using [InkWell](https://api.flutter.dev/flutter/material/InkWell-class.html) instead.

If the [onPressed](https://api.flutter.dev/flutter/material/MaterialButton/onPressed.html) callback is null, then the button will be disabled, will not react to touch, and will be colored as specified by the [disabledColor](https://api.flutter.dev/flutter/material/MaterialButton/disabledColor.html) property instead of the [color](https://api.flutter.dev/flutter/material/MaterialButton/color.html) property. If you are trying to change the button's [color](https://api.flutter.dev/flutter/material/MaterialButton/color.html) and it is not having any effect, check that you are passing a non-null [onPressed](https://api.flutter.dev/flutter/material/MaterialButton/onPressed.html) handler.

Flat buttons have a minimum size of 88.0 by 36.0 which can be overridden with [ButtonTheme](https://api.flutter.dev/flutter/material/ButtonTheme-class.html).

The [clipBehavior](https://api.flutter.dev/flutter/material/MaterialButton/clipBehavior.html) argument must not be null.

### Key properties

Name | Property | Description
-----|----------|------------
Container color | `color` | The button's fill color.
Text color | `textColor` | The color to use for this button's text.

A text button's text is styled using the `TextStyle` passed to its child `Text` object:

Name | Property | Description
-----|----------|------------
Text typeface | `fontFamily` | The name of the font used for the label.
Text style | `fontStyle` | The style of the font used for the label.
Text size | `fontSize` | The size of the label's font.


### Text button example

The following example shows a text button with black text on white background.

<img src="images/flutter-text.png" width="20%" alt="Text button example in Flutter showing the black text \'Flat Button\' over a white background.">

```dart
FlatButton(
  onPressed: () {
    /*...*/
  },
  child: Text(
    "Text Button",
    style: TextStyle(fontSize: 20)
  ),
)
```

## Outlined button

_Repeat for outlined button..._

## Contained button

_Repeat for contained button..._

## Toggle button

_Repeat for toggle button..._