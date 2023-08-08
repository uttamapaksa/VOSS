import { StyledEngineProvider } from '@mui/material';
import { styled } from 'styled-components';

export const Container = styled.div`
  display: flex;
  justify-content: center;
`

export const LeftSection = styled.div`
  display: flex;
  flex-direction: column;
  margin-right: 30px;
`

export const RightSection = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
`

export const GoDubbingListBtn = styled.button`
  width: 80px;
  height: 30px;
`