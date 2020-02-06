<!--docs:
title: "Buttons"
layout: detail
section: components
excerpt: "Flutter Buttons usage document"
ide_version: "<cIDE name> <compatible IDE version and build number>"
material_package_version: "<compatible Material platform package version number>"
iconId:
path: /
api_doc_root:
-->

# Buttons

[Buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.

There are four types of buttons:

1. [Text button](#text-button)
1. [Outlined button](#outlined-button)
1. [Contained button](#contained-button)
1. [Toggle button](#toggle-button)

![Example of the four button types](assets/buttons_types.png)

## Using buttons

Before you can use Material buttons, you need to import the Material Components package for Flutter: `package:flutter/material.dart`.

You need to be using a [`MaterialApp`](https://api.flutter.dev/flutter/material/MaterialApp-class.html).

For more information on getting started with the Material for Flutter, go to the Flutter [Material library](https://api.flutter.dev/flutter/material/material-library.html) page.

### Making buttons accessible

Flutter's APIs support accessibility setting for large fonts, screen readers, and sufficient contrast. For more information, go to Flutter's [accessibility](https://flutter.dev/docs/development/accessibility-and-localization/accessibility) and [internationalization](https://flutter.dev/docs/development/accessibility-and-localization/internationalization) pages.

Flutter's button component also supports component labeling...\<developers need to insert information on label setting\>

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).

## Text button

[Text buttons](https://material.io/components/buttons/#text-button) are typically used for less-pronounced actions, including those located in dialogs and cards. In cards, text buttons help maintain an emphasis on card content.

### Text button examples

API and source code:
* `FlatButton`
    * [Class description](https://api.flutter.dev/flutter/material/FlatButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/flat_button.dart)

The following example shows a text button with a text label.

!["Text button example for Flutter with purple text 'Text button' over a white background."](assets/text-button.svg)

```dart
FlatButton(
    textColor: Color(0xFF6200EE),
    onPressed: () {
        // Respond to button press
    },
    child: Text("TEXT BUTTON"),
)
```

<details>
<summary><b>Adding an icon to a text button</b></summary>
<br>
    
The following example shows a text button with an icon.

!["Text button with purple text 'Text button' and '+' icon over a white background."](assets/text-button-icon.svg)

```dart
FlatButton.icon(
    textColor: Color(0xFF6200EE),
    onPressed: () {
        // Respond to button press
    },
    icon: Icon(Icons.add, size: 18),
    label: Text("TEXT BUTTON"),
)
```

</details>

### Anatomy and key properties

A text button has a text label, a transparent container and an optional icon.

![Text button anatomy diagram](assets/text_button_anatomy.png)

1. Text label
1. Container
1. Icon

<details>
<summary><b>Text label</b> properties</summary>
<br>

|  | Property |
| --- | --- |
| **Text label** | `child` and `label` on `FlatButton.icon` |
| **Color** | `textColor` |
| **Disabled Text Color** | `disabledTextColor` |
| **Typography** | `style` on `child` or `label` |

</details>

<details>
<summary><b>Container</b> properties</summary>
<br>

|  | Property |
| --- | --- |
| **Color** | `color` |
| **Stroke color** | N/A |
| **Stroke width** | N/A |
| **Shape** | `shape` |
| **Elevation** | `elevation` |
| **Ripple color** | `splashColor` |
| **Disabled color** | `disabledColor` |
| **Disabled elevation** | `disabledElevation` |

</details>

<details>
<summary><b>Icon</b> properties</summary>
<br>
    
|  | Property |
| --- | --- |
| **Icon** | `icon` |
| **Color** | `color` on `icon` |
| **Size** | `size` on `icon` |

</details>

<details>
<summary><b>Constructors</b></summary>
<br>

|  | Constructor |
| --- | --- |
| **Default constructor** | `FlatButton()` |
| **Icon constructor** | `FlatButton.icon()` |

</details>

## Outlined button

[Outlined buttons](https://material.io/components/buttons/#outlined-button) are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

### Outlined button examples

API and source code:

* `OutlineButton`
    * [Class definition](https://api.flutter.dev/flutter/material/OutlineButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/outline_button.dart)

!["Outlined button with purple text 'Outlined button' and grey border over a white background."](assets/outlined-button.svg)

```dart
OutlineButton(
    textColor: Color(0xFF6200EE),        
    highlightedBorderColor: Colors.black.withOpacity(0.12),
    onPressed() {
        // Respond to button press
    },
    child: Text("OUTLINED BUTTON"),
)
```

<details>
<summary><b>Adding an icon to an outlined button</b></summary>
<br>

The following example shows an outlined button with an icon.

!["Outlined button with purple text 'Outlined button', grey border and '+' icon over a white background."](assets/outlined-button-icon.svg)

```dart
OutlineButton.icon(
    textColor: Color(0xFF6200EE),
    highlightedBorderColor: Colors.black.withOpacity(0.12),
    onPressed: () {
        // Respond to button press
    },
    icon: Icon(Icons.add, size: 18),
    label: Text("OUTLINED BUTTON"),
)
```

</details>

### Anatomy and key properties

An outlined button has a text label, a stroked container and an optional icon.

![Outlined button anatomy diagram](assets/outlined_button_anatomy.png)

1. Text label
1. Container
1. Icon

<details>
<summary><b>Text label</b> properties</summary>
<br>

|  | Property |
| --- | --- |
| **Text label** | `child` and `label` on `OutlineButton.icon` |
| **Color** | `textColor` |
| **Disabled Text Color** | `disabledTextColor` |
| **Typography** | `style` on `child` or `label` |

</details>

<details>
<summary><b>Container</b> properties</summary>
<br>
    
|  | Property |
| --- | --- |
| **Color** | `color` |
| **Stroke color** | `borderSide` and `disabledBorderColor` and `highlightedBorderColor` |
| **Stroke width** | `borderSide` |
| **Shape** | `shape` |
| **Elevation** | `elevation` |
| **Ripple color** | `splashColor` |

</details>

<details>
<summary><b>Icon</b> properties</summary>
<br>
    
|  | Property |
| --- | --- |
| **Icon** | `icon` |
| **Color** | `color` on `icon` |
| **Size** | `size` on `icon` |

</details>

<details>
<summary><b>Constructors</b></summary>
<br>

|  | Constructor |
| --- | --- |
| **Default constructor** | `OutlineButton` |
| **Icon constructor** | `OutlineButton.icon` |

</details>

## Contained button

[Contained buttons](https://material.io/components/buttons/#contained-button) are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

### Contained button examples

API and source code:

* `RaisedButton`
    * [Class definition](https://api.flutter.dev/flutter/material/RaisedButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/raised_button.dart)

The following example shows a contained button with a text label and a filled container.

!["Contained button with white text 'Contained button' and purple container over a white background."](assets/contained-button.svg)

```dart
RaisedButton(
    textColor: Colors.white,
    color: Color(0xFF6200EE),
    onPressed: () {
        // Respond to button press
    },
    child: Text('CONTAINED BUTTON'),
)
```

<details>
<summary><b>Adding an icon to a contained button</b></summary>
<br>

The following example shows a contained button with an icon.

!["Contained button with white text 'Contained button', purple container and '+' icon over a white background."](assets/contained-button-icon.svg)

```dart
RaisedButton.icon(
    textColor: Colors.white,
    color: Color(0xFF6200EE),
    onPressed: () {
        // Respond to button press
    },
    icon: Icon(Icons.add, size: 18),
    label: Text("CONTAINED BUTTON"),
)
```

</details>

### Anatomy and key properties

A contained button has a text label, a filled container and an optional icon.


![Contained button anatomy diagram](assets/contained_button_anatomy.png)

1. Text label
1. Container
1. Icon

<details>
<summary><b>Text label</b> properties</summary>
<br>
    
|  | Property |
| --- | --- |
| **Text label** | `child` and `label` on `RaisedButton.icon` |
| **Color** | `textColor` |
| **Disabled Text Color** | `disabledTextColor` |
| **Typography** | `style` on `child` or `label` |

</details>

<details>
<summary><b>Container</b> properties</summary>
<br>
    
|  | Property |
| --- | --- |
| **Color** | `color` |
| **Stroke color** | N/A |
| **Stroke width** | N/A |
| **Shape** | `shape` |
| **Elevation** | `elevation` |
| **Ripple color** | `splashColor` |

</details>

<details>
<summary><b>Icon</b> properties</summary>
<br>
    
|  | Property |
| --- | --- |
| **Icon** | `icon` |
| **Color** | `color` on `icon` |
| **Size** | `size` on `icon` |

</details>

<details>
<summary><b>Constructors</b></summary>
<br>

|  | Constructor |
| --- | --- |
| **Default constructor** | `RaisedButton` |
| **Icon constructor** | `RaisedButton.icon` |

</details>

## Toggle button

[Toggle buttons](https://material.io/components/buttons/#toggle-button) can be used to select from a group of choices.

There are two types of toggle buttons:

* [Toggle button](#toggle-button)
* [Icon](#icon)

### Toggle button

To emphasize groups of related toggle buttons, a group should share a common container.

#### Toggle button examples

API and source code:

* `ToggleButtons`
    * [Class definition](https://api.flutter.dev/flutter/material/ToggleButtons-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/toggle_buttons.dart)

The following example shows a toggle button with three buttons that have text labels.

!["Toggle button example with text labels - 'Button 1', 'Button 2' and 'Button 3' - and grey/purple borders over a white background."](assets/toggle-button-text.svg)

In the state:
```dart
final isSelected = <bool>[false, false, false];
```

In the widget hierarchy:
```dart
ToggleButtons(
    color: Colors.black.withOpacity(0.60),
    selectedColor: Color(0xFF6200EE),
    selectedBorderColor: Color(0xFF6200EE),
    fillColor: Color(0xFF6200EE).withOpacity(0.08),
    splashColor: Color(0xFF6200EE).withOpacity(0.12),
    hoverColor: Color(0xFF6200EE).withOpacity(0.04),
    borderRadius: BorderRadius.circular(4.0),
    constraints: BoxConstraints(minHeight: 36.0),
    isSelected: isSelected,
    onPressed: (index) {
        // Respond to button selection
        setState(() {
            isSelected[index] = !isSelected[index];
        });
    },
    children: [
        Padding(
            padding: EdgeInsets.symmetric(horizontal: 16.0),
            child: Text('BUTTON 1'),
        ),
        Padding(
            padding: EdgeInsets.symmetric(horizontal: 16.0),
            child: Text('BUTTON 2'),
        ),
        Padding(
            padding: EdgeInsets.symmetric(horizontal: 16.0),
            child: Text('BUTTON 3'),
        ),
    ],
)
```

<details>
<summary><b>Implementing an icon-only toggle button</b></summary>
<br>

The following example shows a toggle button with three buttons that have icons.

!["Toggle button example for Flutter with icons - heart, eye and bell - and grey/purple borders over a white background."](assets/toggle-button.svg)

```dart
ToggleButtons(
    color: Colors.black.withOpacity(0.60),
    selectedColor: Color(0xFF6200EE),
    selectedBorderColor: Color(0xFF6200EE),
    fillColor: Color(0xFF6200EE).withOpacity(0.08),
    splashColor: Color(0xFF6200EE).withOpacity(0.12),
    hoverColor: Color(0xFF6200EE).withOpacity(0.04),
    borderRadius: BorderRadius.circular(4.0),
    isSelected: isSelected,
    onPressed: (index) {
        // Respond to button selection
        setState(() {
            isSelected[index] = !isSelected[index];
        });
    },
    children: [
        Icon(Icons.favorite),
        Icon(Icons.visibility),
        Icon(Icons.notifications),
    ],
)
```

</details>

#### Anatomy and key properties

A toggle button has a shared stroked container, icons and/or text labels.

![Toggle button anatomy](assets/toggle_button_anatomy.png)

1. Container
1. Icon

<details>
<summary><b>Selection</b> properties</summary>
<br>

|  | Property |
| --- | --- |
| **Selection state of each button** | `isSelected` |

</details>

<details>
<summary><b>Constructors</b></summary>
<br>

|  | Constructor |
| --- | --- |
| **Default constructor** | `ToggleButtons` |

</details>

### Icon

Icons can be used as toggle buttons when they allow selection, or deselection, of a single choice, such as marking an item as a favorite.

#### Icon example

API and source code:

* `IconButton`
    * [Class definition](https://api.flutter.dev/flutter/material/IconButton-class.html)
    * [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/icon_button.dart)

The following example shows an icon that can be used independently or in items of a `GridView`.

![Toggle button of 4 images, each image with favorite icon in top-right](assets/toggle_icon_screenshot_cropped.png)


In the state:
```dart
var isSelected = false;
var icon = Icons.favorite_border;
```

In the widget hierarchy:
```dart
IconButton(
    icon: Icon(icon),
    color: Colors.white,
    onPressed: () {
        // Respond to icon toggle
        setState(() {
            isSelected = !isSelected;
            icon = isSelected ? Icons.favorite : Icons.favorite_border;
        });
    },
)
```

## Theming buttons

Buttons support [Material Theming](https://material.io/components/buttons/#theming) and can be customized in terms of color, typography and shape.

### Button theming example

The following example shows text, outlined and contained button types with Material Theming.

!["Button theming with three buttons - text, outlined and contained - with green/black color theming and cut corners."](assets/button-theming.svg)

<details>
<summary><b>Implementing button theming</b></summary>
<br>

The colours we will be using in this example:
```dart
const Color shrinePink50 = Color(0xFFFEEAE6);
const Color shrinePink100 = Color(0xFFFEDBD0);
const Color shrinePink300 = Color(0xFFFBB8AC);
const Color shrinePink400 = Color(0xFFEAA4A4);

const Color shrineBrown900 = Color(0xFF442B2D);
const Color shrineBrown600 = Color(0xFF7D4F52);

const Color shrineErrorRed = Color(0xFFC5032B);

const Color shrineSurfaceWhite = Color(0xFFFFFBFA);
const Color shrineBackgroundWhite = Colors.white;
```

In the theme category within the MaterialApp class:
```dart
theme: ThemeData(
  buttonColor: shrinePink100,
  buttonTheme: const ButtonThemeData(
    colorScheme: ColorScheme(
      primary: shrinePink100,
      primaryVariant: shrineBrown900,
      secondary: shrinePink50,
      secondaryVariant: shrineBrown900,
      surface: shrineSurfaceWhite,
      background: shrineBackgroundWhite,
      error: shrineErrorRed,
      onPrimary: shrineBrown900,
      onSecondary: shrineBrown900,
      onSurface: shrineBrown900,
      onBackground: shrineBrown900,
      onError: shrineSurfaceWhite,
      brightness: Brightness.light,
     ),
    textTheme: ButtonTextTheme.normal,
  ),
),
```


[Shrine theme](https://material.io/design/material-studies/shrine.html)
```
Include source code implementing text, outlined, and contained buttons using "Shrine" theme.

```
![Example of buttons with Shrine theme](assets/button_theming_screenshot.png)

```dart

// Copyright (c) 2019, the Dart project authors.  Please see the AUTHORS file
// for details. All rights reserved. Use of this source code is governed by a
// BSD-style license that can be found in the LICENSE file.

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        buttonColor: shrinePink100,
        buttonTheme: const ButtonThemeData(
          colorScheme: ColorScheme(
            primary: shrinePink100,
            primaryVariant: shrineBrown900,
            secondary: shrinePink50,
            secondaryVariant: shrineBrown900,
            surface: shrineSurfaceWhite,
            background: shrineBackgroundWhite,
            error: shrineErrorRed,
            onPrimary: shrineBrown900,
            onSecondary: shrineBrown900,
            onSurface: shrineBrown900,
            onBackground: shrineBrown900,
            onError: shrineSurfaceWhite,
            brightness: Brightness.light,
          ),
          textTheme: ButtonTextTheme.normal,
        ),
      ),
      home: MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  final isSelected = <bool>[false, false, false];
  var isSelectedIcon = false;

  var icon = Icons.favorite_border;
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            FlatButton(
              onPressed: () {
                // Perform some action
              },
              child: const Text('FLAT BUTTON', semanticsLabel: 'FLAT BUTTON 1'),
            ),
            FlatButton.icon(
              icon: const Icon(Icons.ac_unit),
              onPressed: () {},
              label: const Text('ICON FLAT BUTTON'),
            ),
            OutlineButton(
              onPressed: () {},
              child: const Text('OUTLINE BUTTON'),
            ),
            RaisedButton(
              onPressed: () {},
              child: const Text('RAISED BUTTON'),
            ),
            ToggleButtons(
              isSelected: isSelected,
              onPressed: (index) {
                // Respond to button selection
                setState(() {
                  isSelected[index] = !isSelected[index];
                });
              },
              children: [
                Padding(
                  padding: EdgeInsets.symmetric(horizontal: 16.0),
                  child: Text('TOGGLE BUTTON 1'),
                ),
                Padding(
                  padding: EdgeInsets.symmetric(horizontal: 16.0),
                  child: Text('TOGGLE BUTTON 2'),
                ),
                Padding(
                  padding: EdgeInsets.symmetric(horizontal: 16.0),
                  child: Text('TOGGLE BUTTON 3'),
                ),
              ],
            ),
            IconButton(
              icon: Icon(icon),
              color: Colors.white,
              onPressed: () {
                // Respond to icon toggle
                setState(() {
                  isSelectedIcon = !isSelectedIcon;
                  icon =
                      isSelectedIcon ? Icons.favorite : Icons.favorite_border;
                });
              },
            )
          ],
        ),
      ),
    );
  }
}

const Color shrinePink50 = Color(0xFFFEEAE6);
const Color shrinePink100 = Color(0xFFFEDBD0);
const Color shrinePink300 = Color(0xFFFBB8AC);
const Color shrinePink400 = Color(0xFFEAA4A4);

const Color shrineBrown900 = Color(0xFF442B2D);
const Color shrineBrown600 = Color(0xFF7D4F52);

const Color shrineErrorRed = Color(0xFFC5032B);

const Color shrineSurfaceWhite = Color(0xFFFFFBFA);
const Color shrineBackgroundWhite = Colors.white;

```
</details>




