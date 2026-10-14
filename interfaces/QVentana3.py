from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar, QDialog, QDialogButtonBox, QMessageBox
from Color import Color
from PyQt6.QtGui import QAction, QIcon
from dialogs import CustomDialog


class OtraVentana(QWidget):
    def __init__(self): # Asi se crea una funcion
            super().__init__()
            plantilla = QVBoxLayout()
            self.etiqueta = QLabel("Otra Ventana")
            plantilla.addWidget(self.etiqueta)
            self.setLayout(plantilla)

class MainWindow(QMainWindow): # Asi se crea una clase
    def __init__(self): # Asi se crea una funcion
        super().__init__()
        self.setWindowTitle("MiTitulo")
        self.window = OtraVentana() # En este caso creamos la ventana anteriormente y luego la mostramos, tener en cuenta que si usamos valor este no se actualizara al darle al boton (mostrar)
        boton =  QPushButton("Pulsa aqui")
        boton.clicked.connect(self.mostrarVentana)
        self.setCentralWidget(boton)
        
    
    def mostrarVentana(self): # En esta funcion hacemos que si volvemos a pulsar la ventana se cierre
        if self.window.isVisible():
            self.window.hide()
        else:
            self.window.show()
        
app = QApplication([])
window = MainWindow()

window.show()

app.exec() # Poner siempre si no la ventana se cierra instant

