
import re


def runEjemplo1():
    patron = "ab*"
    palabras = ["a", "ab", "abbb", "abab", "b", ""]

    for p in palabras:
        print(f"{p} -> {bool(re.fullmatch(patron, p))}")


def runEjemplo2():
    regex = r"[TO][0-9]{3}"
    lista = ["T001", "0120", "T01", "X001", "T0001"]

    for codigo in lista:
        print(f"{codigo} -> {bool(re.fullmatch(regex, codigo))}")


def runEjemplo3():
    texto = "Sensores: T001 reporta 23.5 C;\n" \
            "S001 reporta 12 personas; T002 reporta 2 C"

    patron = r"[TS][0-9]{3}"

    for coincidencia in re.finditer(patron, texto):
        print(f"Encontrado {coincidencia.group()}, posicion: {coincidencia.start()}")


def main():
    runEjemplo1()
    runEjemplo2()
    runEjemplo3()


if __name__ == "__main__":
    main()
