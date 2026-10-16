from PyQt6.QtCore import Qt, QDate
from PyQt6.QtWidgets import QComboBox, QDateEdit,  QApplication, QMainWindow, QMessageBox, QPushButton, QLabel, QLineEdit, QTextEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout
from Color import Color


class MainWindow(QMainWindow): # Asi se crea una clase

    
    
    def __init__(self): # Asi se crea una funcio 
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.setWindowTitle("MiAplicacion")

        plantillaGeneral = QVBoxLayout(); # Contenedor total
        linea1 = QHBoxLayout();
        linea2 = QHBoxLayout();
        linea3 = QHBoxLayout();
        linea4 = QHBoxLayout();
        linea5 = QHBoxLayout();
        linea1v = QVBoxLayout();
        linea2h = QHBoxLayout();
        
        
        
        label1 = QLabel("Nombre:")
        self.input1 = QLineEdit()
        
        
        label2 = QLabel("Apellidos:")
        self.input2 = QLineEdit()
        
        label3 = QLabel("Fecha de alta:")
        self.fecha3 = QDateEdit();
        self.fecha3.setCalendarPopup(True)
        self.fecha3.setMinimumDate(QDate(2006,1,1))
        
        label4 = QLabel("Departamento:")
        self.combo4 = QComboBox()
        self.combo4.addItems(["Contabilidad", "Administración", "Producción"])
        
     
        
        boton2h1 = QPushButton("Enviar")
        boton2h2 = QPushButton("Reset")
        
        boton2h1.clicked.connect(self.grabar)
        boton2h2.clicked.connect(self.reset)
        
        
        
        linea1.addWidget(label1)  
        linea1.addWidget(self.input1)
        
        linea2.addWidget(label2)  
        linea2.addWidget(self.input2)
        
        linea3.addWidget(label3)  
        linea3.addWidget(self.fecha3)
        
        linea4.addWidget(label4)  
        linea4.addWidget(self.combo4)
        
        
        
        linea2h.addWidget(boton2h1)
        linea2h.addWidget(boton2h2)      


        plantillaGeneral.addLayout(linea1)
        plantillaGeneral.addLayout(linea2)
        plantillaGeneral.addLayout(linea3)
        plantillaGeneral.addLayout(linea4)
        linea5.addLayout(linea1v)
        linea1v.addLayout(linea2h)
        plantillaGeneral.addLayout(linea5)
        
        widget = QWidget()
        widget.setLayout(plantillaGeneral)
        self.setCentralWidget(widget)
      
    def reset(self):
        self.input1.setText(" ")
        self.combo4.setCurrentIndex(0)
        self.input2.setText(" ")
        self.fecha3.setDate(QDate(2006,1,1))
    
        
    def grabar(self):
        if (self.input1.text() != "" and self.input2.text() != ""):
               dlg=QMessageBox(self) # Si queremos que la ventana que salga no tenga nada que ver con nuestro programa
               dlg.setWindowTitle("Confirmacion")
               dlg.setText(f'Si eres {self.input1.text()} {self.input2.text()} pulsa SI')
               dlg.setStandardButtons(QMessageBox.StandardButton.Yes | QMessageBox.StandardButton.No)
               dlg.setIcon(QMessageBox.Icon.Information)
               if dlg.exec() == QMessageBox.StandardButton.Yes: # Si es QMessage box obligatoriamente hay que poner == no va sin nada.
                   self.close();
               else: # Si NO es correcto significa que el usuario le ha dado a un boton con clase rejected (tanto por botones o por darle a la X).
                   self.input1.setText('')
                   self.input2.setText('')
        else:
                dlg2=QMessageBox(self)
                dlg2.setText('Debes rellenar todos los campos correctamente')
                dlg2.setStandardButtons(QMessageBox.StandardButton.Ok)
                dlg2.exec()
              
        
app = QApplication([])
window = MainWindow()
window.show()


app.exec() # Poner siempre si no la ventana se cierra instant