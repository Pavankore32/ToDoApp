# Java Swing To-Do App

This project is a simple **To-Do List Application** built with **Java Swing**.  
The program creates a GUI where users can add and remove tasks easily.

---

## Code Explanation

1. **Class & Frame**
   - The program defines a class `TodoApp` that extends `JFrame`.
   - This creates the main window of the application.

2. **Components**
   - `JTextField input` → where the user types a new task.
   - `JButton addBtn` → adds the task from the text field into the list.
   - `JButton deleteBtn` → removes the selected task.
   - `DefaultListModel<String>` → stores all tasks dynamically.
   - `JList<String>` → displays tasks in a scrollable list.

3. **Layout**
   - The top panel has the input field and **Add** button.
   - The center shows the task list inside a `JScrollPane`.
   - The bottom panel has the **Delete** button.

4. **Event Handling**
   - When **Add** is clicked (or Enter is pressed), the text is taken from the input field and added to the `listModel`.  
     After that, the input field is cleared.
   - When **Delete** is clicked, the currently selected task in the list is removed.
   - The app uses **lambda expressions** for button actions.

5. **Program Entry**
   - The `main` method calls `SwingUtilities.invokeLater(...)` to ensure the GUI runs on the Event Dispatch Thread.
   - `setVisible(true)` makes the frame appear.

---

## How It Looks When Running
- A window opens with:
  - A text field + "Add" button at the top.
  - A list in the middle showing tasks.
  - A "Delete" button at the bottom.
- You can add tasks, and delete them by selecting one and clicking **Delete**.

---

## Author
**Pavan Kore**
