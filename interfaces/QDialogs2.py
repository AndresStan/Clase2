from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar, QDialog, QDialogButtonBox, QMessageBox
from Color import Color
from PyQt6.QtGui import QAction, QIcon
from dialogs import CustomDialog

class MainWindow(QMainWindow): # Asi se crea una clase
    def __init__(self): # Asi se crea una funcion
        super().__init__()
        self.setWindowTitle("MiTitulo")
       
        boton =  QPushButton("Pulsa aqui")
        boton.clicked.connect(self.botonPulsado)
        self.setCentralWidget(boton)
        
    def botonPulsado(self, s):
        dlg=QMessageBox(self) # Si queremos que la ventana que salga no tenga nada que ver con nuestro programa
        dlg.setWindowTitle("Cuadro de mensaje")
        dlg.setText("Este es el mensaje de mi cuadro de mensaje")
        dlg.setStandardButtons(QMessageBox.StandardButton.Yes | QMessageBox.StandardButton.Cancel)
        dlg.setIcon(QMessageBox.Icon.Information)
        if dlg.exec() == QMessageBox.StandardButton.Yes: # Si es QMessage box obligatoriamente hay que poner == no va sin nada.
            print("SISISISISISISISIS")
        else: # Si NO es correcto significa que el usuario le ha dado a un boton con clase rejected (tanto por botones o por darle a la X).
            print("NONOONO")
        
        
app = QApplication([])

window = MainWindow()

window.show()



app.exec() # Poner siempre si no la ventana se cierra instant