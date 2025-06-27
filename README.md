<h1>Java Notes App</h1>

<p>
A simple console-based Notes App built in Java. This app allows users to write notes and read them back using file input and output (FileWriter and BufferedReader).
</p>

<hr />

<h2>🚀 Features</h2>

<ul>
  <li>Write a note and save it to <code>Note.txt</code></li>
  <li>Read all saved notes from the file</li>
  <li>Console-based user interface</li>
  <li>Uses try-with-resources for safe file handling</li>
  <li>Exception handling for file operations</li>
</ul>

<hr />

<h2>📚 How It Works</h2>

<p>When you run the program:</p>

<ol>
  <li>The app shows a menu:<br />
    <pre>
Choose option from below
1. Write a note
2. Read the Note
    </pre>
  </li>
  <li>Choosing <b>1</b>:
    <ul>
      <li>You type your note into the console.</li>
      <li>The app saves it to <code>Note.txt</code>.</li>
    </ul>
  </li>
  <li>Choosing <b>2</b>:
    <ul>
      <li>The app reads and displays all notes from <code>Note.txt</code>.</li>
    </ul>
  </li>
</ol>

<hr />

<h2>💻 Example</h2>

<h3>Writing a Note</h3>

<pre>
Choose option from below
1. Write a note
2. Read the Note
Enter the note you want to write:
Today I learned Java file I/O!
Your note successfully saved
</pre>

<h3>Reading Notes</h3>

<pre>
Choose option from below
1. Write a note
2. Read the Note
Your Notes are:
Today I learned Java file I/O!
</pre>

<hr />

<p align="center"><i>Happy Coding!</i></p>
