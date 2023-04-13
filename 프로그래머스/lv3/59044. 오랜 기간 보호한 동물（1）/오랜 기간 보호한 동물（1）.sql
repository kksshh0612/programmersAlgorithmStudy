-- 코드를 입력하세요
SELECT ANIMAL_INS.NAME, ANIMAL_INS.DATETIME
from ANIMAL_INS left join ANIMAL_OUTS on ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
where ANIMAL_OUTS.ANIMAL_ID is null 
order by ANIMAL_INS.DATETIME 
limit 3;