from PyQt6.QtCore import Qt, QDate
from PyQt6.QtWidgets import QRadioButton ,QComboBox, QDateEdit,  QApplication, QMainWindow, QMessageBox, QPushButton, QLabel, QLineEdit, QTextEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout
from Color import Color


class MainWindow(QMainWindow): # Asi se crea una clase


    def __init__(self): # Asi se crea una funcio 
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.setWindowTitle("MiAplicacion")

        
        plantillaTotal = QVBoxLayout()
        plantillaH = QHBoxLayout()
        
        radio1 = QRadioButton("Aragón")
        radio1.clicked.connect(self.aragon)
        radio2 = QRadioButton("Comunidad Valenciana")
        radio2.clicked.connect(self.valencia)
        self.selector = QComboBox()
        
        plantillaH.addWidget(radio1)
        plantillaH.addWidget(radio2)
        
        
        plantillaTotal.addLayout(plantillaH)
        plantillaTotal.addWidget(self.selector)
        
        
        widget = QWidget()
        widget.setLayout(plantillaTotal)
        self.setCentralWidget(widget)
      
    def aragon(self):
        self.selector.clear()
        self.selector.addItems(["Huesca", "Zaragoza", "Teruel"])
    def valencia(self):
        self.selector.clear()
        self.selector.addItems(["Castellon", "Valencia", "Alicante"])
    

        
app = QApplication([])
window = MainWindow()
window.show()


app.exec() # Poner siempre si no la ventana se cierra instant