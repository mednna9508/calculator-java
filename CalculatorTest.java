#  Rezultati testiranja kalkulatora

Testiranje po metodi crne kutije (black-box), bez gledanja u izvorni kod, sa pozicije krajnjeg korisnika.

---

## 🧪 Test slučajevi i zapažanja

✅ 1. Ulaz: `2+3` → Rezultat: `5` → ✔️ Radi tačno  
✅ 2. Ulaz: `4+5*2` → Rezultat: `14` → ✔️ Ispravno po prioritetu  
✅ 3. Ulaz: `10/2+3` → Rezultat: `8` → ✔️ Ispravno  
⚠️ 4. Ulaz: `10/0` → Rezultat: Greška / Exception → ❌ Deljenje nulom nije obrađeno  
⚠️ 5. Ulaz: `abc+3` → Rezultat: Greška / Exception → ❌ Nema validaciju ulaza  
⚠️ 6. Ulaz: `5++3` → Rezultat: Nepravilno ponašanje → ❌ Nedostaje provera izraza  
⚠️ 7. Ulaz: `10 - 5 +` → Rezultat: Greška → ❌ Nevalidan kraj izraza

---
